package headfirst.chapter05;

/**
 * 사용하면 안되는 고전적인 방법
 * 멀티 스레드 환경에서 여러 개의 인스턴스가 생성될 수 있다.
 */
public class SingletonOld {
    private static SingletonOld uniqueInstance;

    private SingletonOld() {}

    public static SingletonOld getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new SingletonOld();
        }
        return uniqueInstance;
    }
}
