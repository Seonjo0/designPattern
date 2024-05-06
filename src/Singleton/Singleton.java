package Singleton;

public class Singleton {
//    private static Singleton singletonInstance;

//    public static synchronized Singleton getSingletonInstance() {
//        if (singletonInstance == null) {
//            singletonInstance = new Singleton();
//        }
//        return singletonInstance;
//    }

//    private static final Singleton singletonInstance = new Singleton();
//
//    public static synchronized Singleton getSingletonInstance() {
//        return singletonInstance;
//    }

    private static Singleton singletonInstance;

    private static Singleton getSingletonInstance() {
        if (singletonInstance == null) {
            synchronized (Singleton.class) {
                if (singletonInstance == null) {
                    //왜 singletoneInstance 를 두 번 체킹하는가?
                    singletonInstance = new Singleton();
                }
            }
        }
        return singletonInstance;
    }

    public void tell() {
        System.out.println("나는 싱글톤이라네");
    }
}
