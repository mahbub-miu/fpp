package Task1;

final class Triangle {
    private final double base;
    private final double height;

    Triangle(double base, double height){
        this.base=base;
        this.height=height;
    }

    double getBase(){
        return base;
    }

    double getHeight(){
        return height;
    }

    double getAreaOfTriangle(){
        return (double)(0.5*base*height);
    }
}
