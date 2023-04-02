package AbstractFactory;

public class XMLDeptDao implements dao {
    @Override
    public void save() {
        System.out.println("Saving Department data to XML");
    }
}
