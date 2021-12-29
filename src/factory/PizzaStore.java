package factory;

public class PizzaStore {
    
    public Pizza orderPizza(String type){
       Pizza pizza = PizzaFactory.createPizza(type);
        pizza.cut();
        pizza.prepare();
        pizza.bake();
        return pizza;
    }
}
