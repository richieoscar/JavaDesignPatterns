package abstractfactory;

public class DbDeptDao implements Dao {
    @Override
    public void save() {
        System.out.println("Saving file to Department Database");
    }
}
