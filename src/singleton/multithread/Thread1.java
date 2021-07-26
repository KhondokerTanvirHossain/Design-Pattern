package singleton.multithread;

public class Thread1 implements Runnable{
    private final String value;
    public Thread1(String value) {
        this.value = value;
    }

    @Override
    public void run() {
        SingletonSync singleton = SingletonSync.getInstance(value);
        System.out.println(singleton.getValue());
    }
}
