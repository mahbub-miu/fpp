package src.assignment2;

import java.util.Arrays;

public class Prog5 {
    public static void main(String...args){
        int[] inputArrayA={5,6,-4,3,1};
        int[] inputArrayB={3,8,9,11};

        Prog5 p5 = new Prog5();
        int[] resultArray =p5.combine(inputArrayA, inputArrayB);
        System.out.println(Arrays.toString(resultArray));

    }

    public int[] combine(int[] a, int[] b){
        int[] combinedArray = new int[a.length+b.length];
        System.arraycopy(a,0,combinedArray,0,a.length);
        //System.out.println(Arrays.toString(combinedArray));
        System.arraycopy(b,0,combinedArray,a.length,b.length);
        return  combinedArray;


    }

}

