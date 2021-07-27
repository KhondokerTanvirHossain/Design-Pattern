package factory.creator;

import factory.product.ConcreteProduct2;
import factory.product.Product;

public class CreatorProduct2 extends BaseCreator{
    @Override
    public Product createProduct() {
        return new ConcreteProduct2();
    }
}
