package factory.creator;

import factory.product.ConcreteProduct1;
import factory.product.Product;

public class CreatorProduct1 extends BaseCreator{
    @Override
    public Product createProduct() {
        return new ConcreteProduct1();
    }
}
