package factory;

public class CheezaPizza implements Pizza{
    @Override
    public void bake() {
        System.out.println("Baking Cheeze Pizza");
    }

    @Override
    public void cut() {
        System.out.println("Cutting cheeze pizza");

    }

    @Override
    public void prepare() {
        System.out.println("Preparing cheeze pizza");

    }
}
