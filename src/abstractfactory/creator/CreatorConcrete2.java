package abstractfactory.creator;

import abstractfactory.product.product1.Product1;
import abstractfactory.product.product1.Product1Concrete2;
import abstractfactory.product.product2.Product2;
import abstractfactory.product.product2.Product2Concrete2;

public class CreatorConcrete2 implements BaseCreator {
    @Override
    public Product1 createProduct1() {
        return new Product1Concrete2();
    }

    @Override
    public Product2 createProduct2() {
        return new Product2Concrete2();
    }
}
