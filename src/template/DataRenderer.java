package template;

public abstract class DataRenderer {

   public void render() {
        String readata = readData();
        String data = processData(readata);
        System.out.println(data);

    }

    public abstract String readData();

    public abstract String processData(String data);
}
