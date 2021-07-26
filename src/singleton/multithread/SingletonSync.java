package singleton.multithread;

import singleton.singlethread.Singleton;

public final class SingletonSync {

    private static SingletonSync instance;
    private final String value;

    private SingletonSync(String value) {
        this.value = value;
    }

    public static SingletonSync getInstance(String value) {
        if (instance != null)
            return instance;
        synchronized (Singleton.class) {
            if (instance == null)
                instance = new SingletonSync(value);
        }
        return instance;
    }

    public String getValue() {
        return value;
    }
}
