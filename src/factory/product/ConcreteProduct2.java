package factory.product;

public class ConcreteProduct2 implements Product{

    @Override
    public void setAttribute() {
        System.out.println("Set Attribute");
    }

    @Override
    public void doStuff() {
        System.out.println("Do stuff");
    }

    @Override
    public void doMoreStuff() {
        System.out.println("Do more stuff");
    }
}
