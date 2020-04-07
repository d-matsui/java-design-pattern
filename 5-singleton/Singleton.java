public class Singleton {
    private static Singleton singleton = new Singleton();
    private Singleton() {
        System.out.println("Create the singleton instance");
    }
    public static Singleton getInstance() {
        return singleton;
    }
}
