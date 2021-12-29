package abstractfactory;

public class XMLEmployeeDao implements Dao{
    @Override
    public void save() {
        System.out.println("Saving file to Employee Xml");
    }
}
