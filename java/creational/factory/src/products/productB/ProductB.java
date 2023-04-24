package products.productB;

import interfaces.IProduct;

public class ProductB implements IProduct {

    @Override
    public void doStuff() {
        System.out.println("ProductB.doStuff()");
    }
    
}
