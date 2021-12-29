package factory;

public class PizzaFactory {

    public static Pizza createPizza(String type){
        Pizza pizza = null;
        if(type.equals("cheese")){
            pizza = new CheezaPizza();
        }else if(type.equals("veggee")){
            pizza = new VegePizza();
        }
        return pizza;
    }
}
