package singleton;

import java.io.Serializable;

public class DateUtil implements Serializable, Cloneable{

    /*
    1. Singleton must be multi thread safe
    2. Singleton should not be cloneable
    3. Singleton must support serialization be implementing the readResolve method
     */

    private static volatile  DateUtil instance;

    private DateUtil(){

    }
    public static DateUtil getInstance(){
        if(instance==null){
            synchronized (DateUtil.class){
                if(instance ==null){
                    instance = new DateUtil();
                }
            }
        }
        return instance;
    }

    protected Object readResolve(){
        //Supports serialization and ensures the singleton instance is always returned.
        return instance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //This prevents singleton classe from been cloned
         throw new CloneNotSupportedException();
    }
}
