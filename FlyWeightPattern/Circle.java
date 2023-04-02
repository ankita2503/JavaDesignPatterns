package FlyWeightPattern;

public class Circle extends Shape {

    String lable;

    public String getLable() {
        return lable;
    }

    public void setLable(String lable) {
        this.lable = lable;
    }

    @Override
    public void draw(int radius, String fillcolor, String lineColor) {
        System.out.println("Drwaing a " + lable + " with radius " + radius + " with lineColor " + lineColor);
    }

}
