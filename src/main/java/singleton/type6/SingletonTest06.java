package singleton.type6;

public class SingletonTest06 {
    public static void main(String[] args) {

    }
}

//双重检查，推荐使用，线程安全，也效率较高
class Singleton{
    private static volatile Singleton instance;

    private Singleton(){}

    //提供一个静态公有方法，当使用到该方法时，才去创建instance
    public static Singleton getInstance(){
        if(instance == null){
            synchronized(Singleton.class){
                if(instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
