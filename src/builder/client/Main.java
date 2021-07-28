package builder.client;

import builder.builder.Product1Builder;
import builder.builder.Product3Builder;
import builder.director.Director;
import builder.model.Product1;
import builder.model.Product3;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        Product1Builder product1Builder = new Product1Builder();
        director.createType1Product1(product1Builder);
        Product1 product1Type1 = product1Builder.getResult();
        director.createType2Product1(product1Builder);
        Product1 product1Type2 = product1Builder.getResult();
        director.createType3Product3(product1Builder);

        Product3Builder product3Builder = new Product3Builder();
        director.createType3Product3(product3Builder);
        Product3 product3Type3 = product3Builder.getResult();

        System.out.println(product1Type1);
        System.out.println(product1Type2);
        System.out.println(product3Type3);
    }
}
