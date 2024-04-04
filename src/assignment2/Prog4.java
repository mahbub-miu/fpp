package src.assignment2;

public class Prog4 {
    public static void main(String...args){

        //converting float to integer
        float num1=1.27f;
        float num2=3.881f;
        float num3=9.6f;
        float sum = num1 + num2 + num3;
        System.out.println("The summation of floats : "+sum);
        System.out.println("The summation of floats in converted integer: "+(int)sum);
        System.out.println("The summation of floats in nearest rounded integer is : " +(Math.round(sum)));





    }
}
