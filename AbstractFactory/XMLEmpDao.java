package AbstractFactory;

public class XMLEmpDao implements dao {
    @Override
    public void save() {
        System.out.println("Saving employee data to XML");
    }
}
