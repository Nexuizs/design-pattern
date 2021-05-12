package factory.absfactory.pizzastore.order;

import factory.absfactory.pizzastore.pizza.BJCheesePizza;
import factory.absfactory.pizzastore.pizza.BJPepperPizza;
import factory.absfactory.pizzastore.pizza.Pizza;

//这是工厂子类
public class BJFactory implements AbsFactory{

    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if(orderType.equals("cheese")){
            pizza = new BJCheesePizza();
        } else if (orderType.equals("pepper")){
            pizza = new BJPepperPizza();
        }
        return null;
    }
}
