import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Base64;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;

public class EncryptionDecorator extends DataSourceDecorator {
    String algorithm = "AES/CBC/PKCS5Padding";
    SecretKey key;
    IvParameterSpec ivParameterSpec;
    Logger logger = Logger.getLogger(EncryptionDecorator.class.getName());

    public EncryptionDecorator(DataSource source) {
        super(source);
        logger.setLevel(Level.WARNING);
        try {
            key = generateKey(128);
            ivParameterSpec = generateIv();

        } catch (Exception e) {
            logger.severe("Exception1: " + e);
        }

    }

    public void writeData(String data) {
        logger.info("Encrypting data\n");
        String encrypted_text = "";
        // encrypting the data
        try {
            // Initializing a Cipher object
            logger.info("Input Text : " + data);
            encrypted_text = encrypt(algorithm, data, key, ivParameterSpec);
            logger.info("Encryptedtext : " + encrypted_text);

            super.writeData(encrypted_text);

        } catch (Exception e) {
            logger.severe("Exception2: " + e);
            e.printStackTrace();
        }

    }

    public String readData() {
        String data = super.readData();
        logger.info("\nDecrypting data if encrypted\n");
        logger.info("Encryptedtext : " + data);
        String decrypted_data = "";

        // Do decryption
        try {

            decrypted_data = decrypt(algorithm, data, key, ivParameterSpec);
            logger.info("Decryptedtext : " + decrypted_data);

            return decrypted_data;

        } catch (Exception e) {
            logger.severe("Exception3: " + e);
            e.printStackTrace();
        }

        return decrypted_data;
    }

    public static SecretKey generateKey(int n) throws NoSuchAlgorithmException {
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        keyGenerator.init(n);
        SecretKey key = keyGenerator.generateKey();
        return key;
    }

    public static String encrypt(String algorithm, String input, SecretKey key,
            IvParameterSpec iv) throws NoSuchPaddingException, NoSuchAlgorithmException,
            InvalidAlgorithmParameterException, InvalidKeyException,
            BadPaddingException, IllegalBlockSizeException {

        Cipher cipher = Cipher.getInstance(algorithm);
        cipher.init(Cipher.ENCRYPT_MODE, key, iv);
        byte[] cipherText = cipher.doFinal(input.getBytes());
        return Base64.getEncoder()
                .encodeToString(cipherText);
    }

    public static String decrypt(String algorithm, String cipherText, SecretKey key,
            IvParameterSpec iv) throws NoSuchPaddingException, NoSuchAlgorithmException,
            InvalidAlgorithmParameterException, InvalidKeyException,
            BadPaddingException, IllegalBlockSizeException {

        Cipher cipher = Cipher.getInstance(algorithm);
        cipher.init(Cipher.DECRYPT_MODE, key, iv);
        byte[] plainText = cipher.doFinal(Base64.getDecoder()
                .decode(cipherText));
        return new String(plainText);
    }

    public static IvParameterSpec generateIv() {
        byte[] iv = new byte[16];
        new SecureRandom().nextBytes(iv);
        return new IvParameterSpec(iv);
    }
}
