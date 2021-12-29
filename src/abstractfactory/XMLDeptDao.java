package abstractfactory;

public class XMLDeptDao implements Dao{
    @Override
    public void save() {
        System.out.println("Saving file to Department XML");
    }
}
