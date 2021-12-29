package abstractfactory;

public abstract class DaoFactory {

    public abstract Dao createDao(String type);
}
