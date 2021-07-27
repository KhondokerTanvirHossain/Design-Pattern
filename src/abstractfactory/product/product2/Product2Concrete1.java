package abstractfactory.product.product2;

public class Product2Concrete1 implements Product2 {

    @Override
    public void setAttributes() {
        System.out.println("Set Attribute");
    }

    @Override
    public void doSomethingWithIt() {
        System.out.println("Do Something with it");
    }
}
