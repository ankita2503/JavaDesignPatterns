package AbstractFactory;

public class daoFactoryProducer {

    public static daoAbstractFactory produce(String factoryType) {
        daoAbstractFactory factory = null;
        if (factoryType == "xml") {
            return new XMLdaoFactory();
        }
        if (factoryType == "db") {
            return new DBdaoFactory();
        }

        return null;
    }
}
