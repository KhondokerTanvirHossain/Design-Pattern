package abstractfactory.client;

import abstractfactory.creator.BaseCreator;
import abstractfactory.product.product1.Product1;
import abstractfactory.product.product2.Product2;

public class Client {
    private final Product1 product1;
    private Product2 product2;

    public Client(BaseCreator creator) {
        product1 = creator.createProduct1();
        product2 = creator.createProduct2();
    }

    public void doSomething() {
        product1.setAttributes();
        product1.doSomethingWithIt();
        product2.setAttributes();
        product2.doSomethingWithIt();
    }
}
