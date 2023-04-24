package products;

public class Manual {

    String manual = "This is a manual: ";

    public void addContent(String content) {
        // Add content to the manual
        this.manual = this.manual + "\n" + content;
    }

    public void createPdf() {
        // Create a PDF file
        System.out.println(manual);
        System.out.println("PDF created");
    }
}
