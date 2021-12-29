import abstractfactory.Dao;
import abstractfactory.DaoFactory;
import abstractfactory.DaoFactoryProducer;
import adapter.WaetherUI;
import adapter.WeatherFinderAdapter;
import builder.Form;
import flyweight.PaintApp;
import singleton.DateUtil;
import template.CSVDataRenderer;
import template.DataRenderer;
import template.XMLDataRenderer;

import java.io.*;

public class Test {

    public static void main(String[] args) throws IOException {
        //testSingleton();
        // testAbstractFactory();
//        testTemplatePattern();
//        testAdapterPattern();
//        testFlyweight();
        testBuilder();

    }

    private static void testSingleton() throws IOException {
        DateUtil obj1 = DateUtil.getInstance();
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("C:\\Users\\NAJCOM LAPTOP 4\\Documents\\webprojects\\sigletons\\obj1.ser"));
        outputStream.writeObject(obj1);
        DateUtil obj2 = DateUtil.getInstance();

        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("C:\\Users\\NAJCOM LAPTOP 4\\Documents\\webprojects\\sigletons\\obj1.ser"));
        try {
            obj2 = (DateUtil) inputStream.readObject();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(obj1 == obj2);
        inputStream.close();
        outputStream.close();
    }

    private static void testAbstractFactory() {
        DaoFactory dbFactory = DaoFactoryProducer.produce("xml");
        Dao dbDao = dbFactory.createDao("employee");
        dbDao.save();
    }

    private static void testTemplatePattern() {
        DataRenderer dataRenderer = new CSVDataRenderer();
        dataRenderer.render();
        dataRenderer = new XMLDataRenderer();
        dataRenderer.render();
    }

    public static void testAdapterPattern(){
        WaetherUI waetherUI = new WaetherUI();
        int weatherTemp = waetherUI.showTemperature(10001);
        System.out.println(weatherTemp);
    }

    public static  void testFlyweight(){
        PaintApp paintApp = new PaintApp();
        paintApp.render(20);
    }

    public static void testBuilder(){
        Form.FormBuilder builder = new Form.FormBuilder();
        builder.firstName("Oscar")
                .lastName("Anyiam")
                .email("oscaranyiam94@gmail.com");
        Form form = builder.build();
        System.out.println(form);
    }
}
