package singleton.singlethread;

public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance("Foo");
        System.out.println(singleton.getValue());
    }
}
