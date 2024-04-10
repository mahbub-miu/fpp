package src.Task1;

import java.util.Scanner;

public class ReverseOrder {
    public static void main(String...args){

        int n= 123456;
        showInReverse(n);
    }
    static void showInReverse(int num){
        if(num<10){
            System.out.println(num);
        }
        else {
            System.out.println(num%10);
            showInReverse(num/10);
        }
    }
}
