package headfirst.chapter05;

/**
 * 처음부터 생성하기
 */
public class SingletonV2 {
    private static SingletonV2 uniqueInstance = new SingletonV2();

    private SingletonV2() {}

    public static synchronized SingletonV2 getInstance() {
        return uniqueInstance;
    }
}
