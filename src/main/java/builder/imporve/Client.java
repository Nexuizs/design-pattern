package builder.imporve;


import com.sun.org.apache.xpath.internal.SourceTree;

public class Client {
    public static void main(String[] args) {
        //盖普通房子
        CommonHouse commonHouse = new CommonHouse();
        //准备建造房子的指挥者
        HouseDirector houseDirector = new HouseDirector(commonHouse);
        //完成盖房子
        House house = houseDirector.constructHouse();

        System.out.println(house);


        HighBuilding highBuilding = new HighBuilding();
        HouseDirector houseDirector1 = new HouseDirector(highBuilding);

        House house1 = houseDirector1.constructHouse();

        System.out.println(house1);
    }
}
