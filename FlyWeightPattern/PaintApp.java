package FlyWeightPattern;

public class PaintApp {

    public void render(int numerOfShapes){
        Shape shape = null;
        for(int i=1;i<numerOfShapes;i++){
            if(i%2==0){
                shape = ShapeFactory.getShape("circle");
                shape.draw(10,"red","blue");
            } else {
                shape = ShapeFactory.getShape("rectangle");
                shape.draw(10,20,"blue");
            }
        }
    }
}
