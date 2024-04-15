package src.Task5;

public class Main {
    public static void main(String[] args) {
        Computer c1 = new Computer("HP","Intel",16,3.0);
        Computer c2 = new Computer("HP","Intel",16,3.0);
        System.out.println("Configuration of Computer-1:");
        System.out.println(c1);

        System.out.println("\nConfiguration of Computer-2:");
        System.out.println(c2);



        if((c1.equals(c2)) && c1.hashCode()==c2.hashCode()){
            System.out.println("Hash code of C1: "+c1.hashCode());
            System.out.println("Hash code of C2: "+c2.hashCode());
            System.out.println("Computers are same based on configuration and hash code");
        } else {
            System.out.println("Hash code of C1: "+c1.hashCode());
            System.out.println("Hash code of C2: "+c2.hashCode());
            System.out.println("Computers are not same based on hash code");

        }


    }
}
