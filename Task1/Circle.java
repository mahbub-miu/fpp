package Task1;

final class Circle {
    private final double radius;

    Circle(double radius){
        this.radius=radius;
    }

    double getRadius(){
        return radius;
    }

    double getCircleArea(){
        return Math.PI*radius*radius;
    }
}
