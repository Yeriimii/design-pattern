package headfirst.chapter05;

/**
 * getInstance()에 synchronized 사용
 */
public class SingletonV1 {
    private static SingletonV1 uniqueInstance;

    private SingletonV1() {

    }

    public static synchronized SingletonV1 getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new SingletonV1();
        }
        return uniqueInstance;
    }
}
