package abstractfactory.creator;

import abstractfactory.product.product1.Product1;
import abstractfactory.product.product2.Product2;

public interface BaseCreator {
    Product1 createProduct1();
    Product2 createProduct2();
}
