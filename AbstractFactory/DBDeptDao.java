package AbstractFactory;

public class DBDeptDao implements dao {
    @Override
    public void save() {
        System.out.println("Saving Department data to DB");
    }
}
