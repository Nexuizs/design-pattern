package factory.absfactory.pizzastore.order;

import factory.absfactory.pizzastore.pizza.*;

//这是工厂子类
public class LDFactory implements AbsFactory{

    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if(orderType.equals("cheese")){
            pizza = new LDCheesePizza();
        } else if (orderType.equals("pepper")){
            pizza = new LDPepperPizza();
        }
        return pizza;
    }
}
