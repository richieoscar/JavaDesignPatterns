package abstractfactory;

public class DbEmployeeDao implements Dao{
    @Override
    public void save() {
        System.out.println("Saving file to Employee Database");
    }
}
