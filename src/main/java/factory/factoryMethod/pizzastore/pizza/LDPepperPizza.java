package factory.factoryMethod.pizzastore.pizza;

public class LDPepperPizza extends Pizza{

    public void prepare() {
        setName("北京胡椒披萨");
        System.out.println("北京胡椒披萨--------准备原材料");
    }
}
