package src.assignment2;

public class Prog6 {
    public static void main(String...args){
        int[] inputs= new int[]{2, -21, -30, 45, 0, 12, -524, 6, 3, 1, 0, -42};
        int minValue=Prog6.min(inputs);
        System.out.println("Minimum value is : "+minValue);
    }

    static int min(int[] arrayOfInts){
        int minNumber=arrayOfInts[0];
        for(int i=1; i<arrayOfInts.length; i++){
            if(arrayOfInts[i]<minNumber){
                minNumber=arrayOfInts[i];
            }

        }
        return  minNumber;
    }

}
