package abstractfactory;

public class DeptDaoFactory extends DaoFactory {
    @Override
    public Dao createDao(String type) {
        Dao dao = null;
        if (type.equals("employee")) {
            dao = new DbEmployeeDao();
        } else if (type.equals("department")) {
            dao = new DbDeptDao();
        }
        return dao;
    }
}
