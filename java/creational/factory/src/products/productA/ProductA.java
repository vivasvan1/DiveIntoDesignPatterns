package products.productA;

import interfaces.IProduct;

public class ProductA implements IProduct {

    @Override
    public void doStuff() {
        System.out.println("ProductA.doStuff()");
    }
    
}
