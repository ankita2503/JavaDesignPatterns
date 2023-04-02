package AbstractFactory;

public class XMLdaoFactory extends daoAbstractFactory{


    @Override
    public dao createDAO(String type) {
        if(type=="EMP"){
            return new XMLEmpDao();
        }
        if(type=="DEPT"){
            return new XMLDeptDao() ;
        }
        return null;
    }
}
