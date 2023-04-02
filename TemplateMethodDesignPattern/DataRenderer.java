package TemplateMethodDesignPattern;

public abstract class DataRenderer {

    public void render(){
        System.out.println("rendering data");
        String data = readData();
        processdata(data);
    }

    public abstract String readData();

    public abstract String processdata(String data);
}
