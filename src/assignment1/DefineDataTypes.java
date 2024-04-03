package src.assignment1;

public class DefineDataTypes {
    public static void main(String...args){



        int myRandom = RandomNumbers.getRandomInt(0, 2_000_000_000);
        System.out.println(myRandom);
        /* following if block is to check which data type should be appropriate to store the generated random number
        Here we don't need to check long data type as the method is returning int.
        So no possibility to have larger number than integer max value.
        Also we don't need to consider the float or double data types for the same reason.
         */
        if(myRandom<=Byte.MAX_VALUE){
            System.out.println("Data type is : Byte");
        }
        else if(myRandom<=Short.MAX_VALUE){
            System.out.println("Data type is : Short");
        }
        else
            System.out.println("Data type is : Integer");

    }

}
