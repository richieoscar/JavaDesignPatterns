package factory;

public class VegePizza implements Pizza{
    @Override
    public void bake() {
        System.out.println("Baking Vegepizza");
    }

    @Override
    public void cut() {
        System.out.println("Cutting Vegepizza");
    }

    @Override
    public void prepare() {
        System.out.println("Preparing vegepizz");

    }
}
