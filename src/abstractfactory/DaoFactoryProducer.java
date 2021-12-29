package abstractfactory;

public class DaoFactoryProducer {

    public static DaoFactory produce(String dao) {
        DaoFactory daoFactory = null;
        if (dao.equals("db")) {
            daoFactory = new DeptDaoFactory();
        } else if (dao.equals("xml")) {
            daoFactory = new XMLDaoFactory();
        }
        return daoFactory;
    }
}
