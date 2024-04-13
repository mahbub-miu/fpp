package src.Task1;

public class Rectangle extends Shape {
    protected double width;
    protected double height;

    Rectangle(String color, double width, double height){
        super(color);
        this.height=height;
        this.width=width;
    }

    @Override
    public double calculateArea(){
        return width * height;
    }

    @Override
    public double calculatePerimeter(){
        return 2 * width + 2 * height;
    }
}
