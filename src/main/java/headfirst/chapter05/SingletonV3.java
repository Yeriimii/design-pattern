package headfirst.chapter05;

/**
 * 정적 변수에 volatile 키워드 사용
 * 생성되어있는지 확인 후, 생성되어 있지 않아 생성될 때만 동기화 사용
 * V1의 성능 개선 버전
 */
public class SingletonV3 {
    private volatile static SingletonV3 uniqueInstance;

    private SingletonV3() {}

    public static synchronized SingletonV3 getInstance() {
        if (uniqueInstance == null) {
            synchronized (SingletonV3.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new SingletonV3();
                }
            }
        }
        return uniqueInstance;
    }
}
