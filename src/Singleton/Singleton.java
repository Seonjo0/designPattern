package Singleton;

public class Singleton {
    private static Singleton singletonInstance;

    public static synchronized Singleton getSingletonInstance() {
        if (singletonInstance == null) {
            singletonInstance = new Singleton();
        }
        return singletonInstance;
    }

    public void tell() {
        System.out.println("나는 싱글톤이라네");
    }
}
