package factory.absfactory.pizzastore.pizza;

public class LDCheesePizza extends Pizza {

    public void prepare() {
        setName("伦敦奶酪披萨");
        System.out.println("伦敦奶酪披萨--------准备原材料");
    }
}
