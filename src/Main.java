import Singleton.Singleton;

public class Main {
    public static void main(String[] args) {
        Singleton mySingleton = Singleton.getSingletonInstance();
        mySingleton.tell();
    }
}