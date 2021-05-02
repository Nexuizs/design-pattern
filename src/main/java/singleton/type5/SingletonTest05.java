package singleton.type5;

public class SingletonTest05 {
    public static void main(String[] args) {

    }
}

//懒汉式，线程安全，同步代码块
//不仅线程不安全，效率还低，根本不能使用
class Singleton{
    private static Singleton instance;

    private Singleton(){}

    //提供一个静态公有方法，当使用到该方法时，才去创建instance
    //即懒汉式
    //效率太低，已经实例化了但是却要等待同步机制
    public static Singleton getInstance(){
        if(instance == null){
            synchronized(Singleton.class){
                instance = new Singleton();
            }
        }
        return instance;
    }
}
