package src.assignment2;

import src.assignment1.RandomNumbers;

public class Prog1 {
    public static void main(String...args){
        int x = RandomNumbers.getRandomInt(1, 9);
        int y=RandomNumbers.getRandomInt(3,14);
        //double result1=Math.pow(Math.PI,x);
        //double result2=Math.pow(y,Math.PI);

        System.out.println("The result of PI raised to the power of "+ x+" : "+Math.pow(Math.PI,x));
        System.out.println("The result of "+ y +" raised to the power of PI :"+Math.pow(y,Math.PI));

    }
}
