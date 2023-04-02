package Singleton;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Singleton implements Serializable,Cloneable {
    private static final long serialVersionUID = 1L;

    private static volatile Singleton INSTANCE;

    //Eager Initialization
    // private static Singleton.Singleton INSTANCE = new Singleton.Singleton();
    //or
/*    static{
        INSTANCE = new Singleton.Singleton();
    }*/

    private Singleton() {

    }

    public static Singleton getInstance() {
        if (INSTANCE == null) {
            synchronized (Singleton.class) {
                if (INSTANCE == null) {
                    INSTANCE = new Singleton();
                }
            }
        }
        return INSTANCE;
    }

    private Object readResolve(){
        return INSTANCE;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
       throw new CloneNotSupportedException();
    }


}
