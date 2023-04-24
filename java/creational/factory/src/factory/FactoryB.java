package factory;

import interfaces.IProduct;
import products.productB.ProductB;

public class FactoryB extends Factory {

    @Override
    IProduct createProduct() {
        return new ProductB();
    }

}
