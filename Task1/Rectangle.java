package Task1;

final class Rectangle {
    private final double width;
    private final double height;

    Rectangle(double width, double height){
        this.height=height;
        this.width=width;
    }

    double getHeight(){
        return height;
    }

    double getWidth(){
        return  width;
    }

    double getAreOfRectangle(){
        return width * height;
    }


}
