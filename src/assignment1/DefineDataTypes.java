package src.assignment1;

public class DefineDataTypes {
    public static void main(String...args){

        long myRandom = RandomNumbers.getRandomInt();
        System.out.println(myRandom);

        if(myRandom<=Byte.MAX_VALUE){
            System.out.println("Data type is : Byte");
        }
        else if(myRandom<=Short.MAX_VALUE){
            System.out.println("Data type is : Short");
        }
        else
            System.out.println("Data type is : Integer"); // no need to check long data type as the method is returning int. So no possibility to have larger number than integer max value

    }

}
