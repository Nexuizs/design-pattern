package factory.factoryMethod.pizzastore.pizza;

public class BJPepperPizza extends Pizza{

    public void prepare() {
        setName("北京奶酪披萨");
        System.out.println("北京奶酪披萨--------准备原材料");
    }
}
