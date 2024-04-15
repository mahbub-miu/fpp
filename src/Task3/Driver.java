package src.Task3;

public class Driver {
    public static void main(String[] args) {
        Figure[] figures= {new UpwardHat(),new UpwardHat(), new DownwardHat(), new FaceMaker(), new Vertical()};
        System.out.println("Output without class names:");
        for (Figure figure : figures) {
            figure.getFigure();
        }

        System.out.println("\nOutput with class names:");
        for (Figure figure : figures) {
            System.out.print(figure.getClass().getSimpleName()+"\t : ");
            figure.getFigure();
            System.out.println();
        }
    }
}
