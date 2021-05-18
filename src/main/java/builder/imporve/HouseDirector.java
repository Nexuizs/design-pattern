package builder.imporve;

//指挥者
public class HouseDirector {

    HouseBuilder houseBuilder = null;

    //构造器传入houseBuilder
    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    //通过setter传入houseBuilder
    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public House constructHouse(){
        houseBuilder.buildBasic();
        houseBuilder.buildwalls();
        houseBuilder.roofed();
        return houseBuilder.buildHouse();
    }

}
