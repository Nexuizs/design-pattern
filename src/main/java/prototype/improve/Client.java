package prototype.improve;


public class Client {
    public static void main(String[] args) {
        Sheep sheep = new Sheep("tom", 1, "白色");
        Sheep sheep1 =  (Sheep) sheep.clone();
        Sheep sheep2 =  (Sheep) sheep.clone();
        Sheep sheep3 =  (Sheep) sheep.clone();
        Sheep sheep4 =  (Sheep) sheep.clone();
        Sheep sheep5 =  (Sheep) sheep.clone();
        Sheep sheep6 =  (Sheep) sheep.clone();
        Sheep sheep7 =  (Sheep) sheep.clone();
        Sheep sheep8 =  (Sheep) sheep.clone();
        Sheep sheep9 =  (Sheep) sheep.clone();
        Sheep sheep10 = (Sheep) sheep.clone();


        System.out.println(sheep1);
        System.out.println(sheep2);
        System.out.println(sheep3);
        System.out.println(sheep4);
        System.out.println(sheep5);
        System.out.println(sheep6);
        System.out.println(sheep7);
        System.out.println(sheep8);
        System.out.println(sheep9);
        System.out.println(sheep10);
    }
}
