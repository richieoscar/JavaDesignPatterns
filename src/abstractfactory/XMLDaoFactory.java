package abstractfactory;

public class XMLDaoFactory extends DaoFactory {
    @Override
    public Dao createDao(String type) {
        Dao dao = null;
        if (type.equals("employee")) {
            dao = new XMLEmployeeDao();
        } else if (type.equals("department")) {
            dao = new XMLDeptDao();
        }
        return dao;
    }
}
