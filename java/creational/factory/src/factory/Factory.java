package factory;

import java.io.Console;

import interfaces.IProduct;

public abstract class Factory {

    abstract IProduct createProduct();

    public void someOperation() {
        System.out.println("Factory.someOperation()");
        IProduct product = createProduct();
        product.doStuff();
    }

}
