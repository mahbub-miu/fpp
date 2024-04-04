package src.assignment2;

import java.text.BreakIterator;
import java.util.Arrays;
import java.util.Scanner;

public class RemoveDups {
    public static void main(String[] args) {

       // User Input to define the array size
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many string do you want to input? ");
        int count = scanner.nextInt();
        String[] strOriginalArray = new String[count];

        //User input into the defined array
        for (int i = 0; i < count; i++) {
            System.out.print("Enter String " + (i + 1) + ": ");
            strOriginalArray[i] = scanner.next();
        }
        scanner.close();


        System.out.println("Inputted String");
        System.out.println("------------------------------------");
        System.out.println(Arrays.toString(strOriginalArray));

        String[] strUniqueArr=new String[count];
        int uniqueCount=0;
        int i;
        boolean douplicateFound=false;
        for( i=0; i<strOriginalArray.length-1; i++){

             if(strUniqueArr[0]==null){
                 strUniqueArr[0]=strOriginalArray[0];
             }
             for(int k=0; k<strUniqueArr.length;k++){
                 if (strUniqueArr[k] ==null){
                     strUniqueArr[k]=strOriginalArray[i];
                     break;
                 }
                 else if(strUniqueArr[k] !=null & strUniqueArr[k].equals(strOriginalArray[i])){
                     douplicateFound=true;
                     break;
                 }
             }
             if (douplicateFound==false){
                 strUniqueArr[i]=strOriginalArray[i];
             }
        }

        String uniqueString=null;
        StringBuilder sb = new StringBuilder();
        for(int n=0; n<strUniqueArr.length; n++){
            if(strUniqueArr[n]!=null){
                sb.append(strUniqueArr[n]);
                //System.out.println(sb);
               sb.append(",");
            }
        }
        //System.out.println("SB :"+sb);
        uniqueString=sb.toString();
       // System.out.println("String : "+uniqueString);
        System.out.println("------------------------------------");
        String[] showUniqueArray=uniqueString.split(",");
        System.out.println("Unique String");
        System.out.println(Arrays.toString(showUniqueArray));


    }
}
