package src.Task1;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[5];
        shapes[0]=new Rectangle("Red",2,2);
        shapes[1]=new Square("White",2);
        shapes[2]=new Circle("Blue",2);
        shapes[3]=new Circle("Green",2);
        shapes[4]=new Rectangle("black",2,2);
        printTotal(shapes);
    }

    public static void  printTotal(Shape[] shapes){
        double totalArea=0;
        double totalPerimeter=0;

        for(Shape shape:shapes){
            totalArea+=shape.calculateArea();
            totalPerimeter+=shape.calculatePerimeter();

        }
        System.out.println("Total Area of all shapes : "+totalArea);
        System.out.println("Total Perimeter of all shapes: "+totalPerimeter);
    }
}
