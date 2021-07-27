package abstractfactory.product.product1;

public class Product1Concrete2 implements Product1{

    @Override
    public void setAttributes() {
        System.out.println("Set Attribute");
    }

    @Override
    public void doSomethingWithIt() {
        System.out.println("Do Something with it");
    }

}
