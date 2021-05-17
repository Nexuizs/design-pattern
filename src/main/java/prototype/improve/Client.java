package prototype.improve;


public class Client {
    public static void main(String[] args) {
        Sheep sheep = new Sheep("tom", 1, "白色");
        sheep.friend = new Sheep("jack", 2, "黑色");
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


        System.out.println(sheep1 + "---" + sheep1.friend.hashCode());
        System.out.println(sheep2 + "---" + sheep2.friend.hashCode());
        System.out.println(sheep3 + "---" + sheep3.friend.hashCode());
        System.out.println(sheep4 + "---" + sheep4.friend.hashCode());
        System.out.println(sheep5 + "---" + sheep5.friend.hashCode());
        System.out.println(sheep6 + "---" + sheep6.friend.hashCode());
        System.out.println(sheep7 + "---" + sheep7.friend.hashCode());
        System.out.println(sheep8 + "---" + sheep8.friend.hashCode());
        System.out.println(sheep9 + "---" + sheep9.friend.hashCode());
        System.out.println(sheep10 + "---" + sheep10.friend.hashCode());
        System.out.println(sheep1 == sheep2);
    }
}
