package singleton.multithread;

public class Main {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Thread1("Foo"));
        Thread thread2 = new Thread(new Thread1("Boo"));
        thread1.start();
        thread2.start();
    }
}
