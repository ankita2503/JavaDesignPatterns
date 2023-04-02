package AbstractFactory;

public class test {

    public static void main(String[] args) {
        daoFactoryProducer factory = new daoFactoryProducer();
        factory.produce("xml").createDAO("EMP").save();

        factory.produce("db").createDAO("DEPT").save();
    }
}
