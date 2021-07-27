package factory.creator;

import factory.product.Product;

public abstract class BaseCreator {

    public abstract Product createProduct();

    public void doSomething() {
        Product product = createProduct();
        System.out.println("Doing Something");
        product.setAttribute();
        product.doStuff();
        product.doMoreStuff();
    }
}
