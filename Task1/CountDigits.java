package Task1;

public class CountDigits {
    public static void main(String...args){
        int n=123456;
        int count=countDigits(n);
        System.out.println("Number of digits in \"N\" is : "+count);
    }
    public static int countDigits(int num){
        if(num < 10){
            return 1;
        }
        return 1+countDigits(num/10);

    }
}
