package Singleton;

import java.io.*;

public class TestSingleton {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("/Users/ankitasingh/Desktop/JavaDesignPatterns/JavaDesignPatterns/Singleton/dateUtil.ser")));
        Singleton singleton1 = Singleton.getInstance();
        oos.writeObject(singleton1);

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream((new File("/Users/ankitasingh/Desktop/JavaDesignPatterns/JavaDesignPatterns/Singleton/dateUtil.ser"))));
        Singleton singleton2 = null;
        singleton2 = (Singleton) ois.readObject();


        oos.close();
        ois.close();

        System.out.println(singleton1==singleton2);

    }




}
