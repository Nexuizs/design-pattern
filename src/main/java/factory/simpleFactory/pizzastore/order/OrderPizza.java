package factory.simpleFactory.pizzastore.order;

import factory.simpleFactory.pizzastore.pizza.CheesePizza;
import factory.simpleFactory.pizzastore.pizza.GreekPizza;
import factory.simpleFactory.pizzastore.pizza.PepperPizza;
import factory.simpleFactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class OrderPizza {

    //构造器
//    public OrderPizza() {
//        Pizza pizza = null;
//        String orderType; //订购披萨的类型
//        do {
//            orderType = gettype();
//            if (orderType.equals("greek")) {
//                pizza = new GreekPizza();
//                pizza.setName("greek");
//            } else if (orderType.equals("cheese")) {
//                pizza = new CheesePizza();
//                pizza.setName("cheese");
//            } else if (orderType.equals("pepper")) {
//                pizza = new PepperPizza();
//                pizza.setName("pepper");
//            } else {
//                break;
//            }
//            //输出pizza制作过程
//            pizza.prepare();
//            pizza.bake();
//            pizza.cut();
//            pizza.box();
//        } while (true);
//    }

    public OrderPizza(SimpleFactory simpleFactory){
        setFactory(simpleFactory);
    }

    SimpleFactory simpleFactory;
    Pizza pizza = null;

    private void setFactory(SimpleFactory simpleFactory) {
        String orderType = null;
        this.simpleFactory = simpleFactory;
        do {
            orderType = gettype();
            pizza = this.simpleFactory.createPizza(orderType);
            if (pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }else{
                System.out.println("订购披萨失败");
                break;
            }
        } while (true);
    }


    //写一个方法,可以获取客户希望订购的披萨种类
    private String gettype() {
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza 种类: ");
            String str = strin.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }


}
