package FlyWeightPattern;

public class Rectangle extends Shape {
    String lable;

    public String getLable() {
        return lable;
    }

    public void setLable(String lable) {
        this.lable = lable;
    }

    @Override
    public void draw(int length, int breadth, String fillStyle) {
        System.out.println("Drwaing a " + lable + " with length " + length + " with breadth " + breadth + " with fillstyle " + fillStyle);
    }
}
