package src.Task3;

public class CalculateSum {
   public static void main(String...args){
       int[] arr={10,20,30,40,50,60};
       int n=arr.length;
       int sum=arrSum(arr,n);
       System.out.println("Total is "+sum);
   }

   static int arrSum(int[] arr,int n ){
      if(n==0){
          return 0;
      }
      else {
          return arr[n-1]+arrSum(arr,n-1);
      }

   }

}
