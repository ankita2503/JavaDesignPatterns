package Singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionProblem {

    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException {
        Singleton singleton1 = null;
        Singleton singleton2 = Singleton.getInstance();
        Constructor<?>[] constructor = Singleton.class.getDeclaredConstructors();

        for (Constructor cons:constructor) {
            cons.setAccessible(true);
            singleton1 = (Singleton) cons.newInstance();
        }

        System.out.println(singleton1.hashCode());
        System.out.println(singleton2.hashCode());
    }
}
