package singleton.type1;

public class SingletonTest01 {
    public static void main(String[] args) {
        //测试
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance.equals(instance2));

        System.out.println(instance.hashCode());
        System.out.println(instance2.hashCode());

        //可用，线程安全，但是不用的话，又实例化了可能造成内存浪费，这个实例一定会被使用，就可以这种方法
    }
}

//饿汉式（静态变量）
class Singleton{
    //1.构造器私有化，外部不能new
    private Singleton(){}

    //2.在本类创建一个对象实例
    private final static Singleton instance = new Singleton();

    //3.提供一个公有的静态方法，返回实例对象
    public static Singleton getInstance(){
        return instance;
    }
}
