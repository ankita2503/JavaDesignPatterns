package AbstractFactory;

public class DBEmpDao implements dao {
    @Override
    public void save() {
        System.out.println("Saving Employee data to DB");
    }
}
