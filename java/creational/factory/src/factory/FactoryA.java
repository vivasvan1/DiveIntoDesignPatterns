package factory;

import interfaces.IProduct;
import products.productA.ProductA;

public class FactoryA extends Factory{
    
        @Override
        IProduct createProduct() {
            return new ProductA();
        }
        
}
