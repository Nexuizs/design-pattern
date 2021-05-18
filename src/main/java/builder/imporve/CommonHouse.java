package builder.imporve;

import builder.AbstractHouse;

public class CommonHouse extends HouseBuilder{

    public void buildBasic() {
        System.out.println("普通房子打地基");
    }

    public void buildwalls() {
        System.out.println("普通房子砌墙");

    }

    public void roofed() {
        System.out.println("普通房子封顶");

    }
}
