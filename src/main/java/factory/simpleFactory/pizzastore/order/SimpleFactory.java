package factory.simpleFactory.pizzastore.order;

import factory.simpleFactory.pizzastore.pizza.CheesePizza;
import factory.simpleFactory.pizzastore.pizza.GreekPizza;
import factory.simpleFactory.pizzastore.pizza.PepperPizza;
import factory.simpleFactory.pizzastore.pizza.Pizza;

public class SimpleFactory {

    public static Pizza createPizza(String orderType) {
        Pizza pizza = null;

        System.out.println("使用简单工厂模式");
        if (orderType.equals("greek")) {
            pizza = new GreekPizza();
            pizza.setName("希腊披萨");
        } else if (orderType.equals("cheese")) {
            pizza = new CheesePizza();
            pizza.setName("奶酷披萨");
        } else if (orderType.equals("pepper")) {
            pizza = new PepperPizza();
            pizza.setName("胡椒披萨");
        }
        return pizza;
    }
}
