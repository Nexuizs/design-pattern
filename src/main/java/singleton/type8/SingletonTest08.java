package singleton.type8;

public class SingletonTest08 {
    public static void main(String[] args) {
        Singleton instance = Singleton.INSTANCE;
        Singleton instance2 = Singleton.INSTANCE;

        System.out.println(instance.equals(instance2));
        System.out.println(instance.hashCode());
        System.out.println(instance2.hashCode());

    }
}

//使用枚举方式，可以实现单例
enum Singleton{
    INSTANCE;
    public void sayOK(){
        System.out.println("ok~!");
    }
}