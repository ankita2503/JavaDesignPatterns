package CommandPattern;

public class test {


    public static void main(String[] args) {
        RemoteControl remoteCOntrol = new RemoteControl();
        remoteCOntrol.setCommand(new OnCommand(new Television()));
        remoteCOntrol.pressButton();
    }
}
