package AbstractFactory;

public class DBdaoFactory extends daoAbstractFactory{


    @Override
    public dao createDAO(String type) {
        if(type=="EMP"){
            return new DBEmpDao();
        }
        if(type=="DEPT"){
            return new DBDeptDao();
        }
        return null;
    }
}
