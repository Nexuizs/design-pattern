package singleton.type7;

public class SingletonTest07 {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance.equals(instance2));

        System.out.println(instance.hashCode());
        System.out.println(instance2.hashCode());
    }
}


//静态内部类，推荐使用
//外部类的装载不会导致内部类的装载，从而保证懒加载
//内部类装载时线程安全的，其他线程无法进入
class Singleton{
    private static volatile Singleton instance;

    private Singleton(){}

    private static class SingletonInstance{
        private static final Singleton INSTANCE = new Singleton();
    }

    //提供一个静态公有方法，当使用到该方法时，才去创建instance
    public static Singleton getInstance(){
        return SingletonInstance.INSTANCE;
    }
}
