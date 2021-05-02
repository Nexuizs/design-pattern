package singleton.type4;

public class SingletonTest04 {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance.equals(instance2));

        System.out.println(instance.hashCode());
        System.out.println(instance2.hashCode());
    }
}

//懒汉式，线程安全，同步方法
class Singleton{
    private static Singleton instance;

    private Singleton(){}

    //提供一个静态公有方法，当使用到该方法时，才去创建instance
    //即懒汉式
    //效率太低，已经实例化了但是却要等待同步机制
    public static synchronized Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}

