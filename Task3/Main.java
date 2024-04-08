package Task3;

import java.util.Scanner;

public class Main {
    public static void main(String...args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter C for Circle \nEnter R for Rectangle \nEnter T for Triangle");
        char choice=sc.next().charAt(0);

        if (choice=='C'){
            System.out.println("Enter the radius of the circle\n");
            double radius=sc.nextDouble();
            Circle cr=new Circle(radius);
            System.out.println("The area of circle is :"+ cr.getCircleArea());
        }
        else if(choice=='R'){
            System.out.println("Enter the width of the Rectangle\n");
            double width= sc.nextDouble();

            System.out.println("Enter the height of the Rectangle");
            double height= sc.nextDouble();
            Rectangle ra=new Rectangle(width, height);
            System.out.println("The area of Rectangle is: "+ra.getAreOfRectangle());
        } else if (choice=='T') {
            System.out.println("Enter base of the triangle\n");
            double base=sc.nextDouble();
            System.out.println("Enter height of the triangle");
            double height=sc.nextDouble();
            Triangle ta = new Triangle(base, height);
            System.out.println("The area of Triangle is : "+ta.getAreaOfTriangle());
        }

        sc.close();

    }

}
