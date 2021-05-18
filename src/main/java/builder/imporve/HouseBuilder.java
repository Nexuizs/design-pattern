package builder.imporve;

//抽象的建造者
public abstract class HouseBuilder {

    private House house = new House();

    public abstract void buildBasic();//砌墙

    public abstract void buildwalls();//封顶

    public abstract void roofed();

    //建造房子好，将产品(房子)返回
    public House buildHouse() {
        return house;
    }
}
