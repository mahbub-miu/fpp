package src.Approach1;

public class Driver {
    public static void main(String[] args) {
        MyTable t = new MyTable();
        t.add('a', "Andrew");
        t.add('b', "Billy");
        t.add('w', "Willie");
        t.add('s', "Smith");

        System.out.println(t);
        String s = t.get('s');
        System.out.println(s);

        //exception checking. Execute below code to check
        //t.add('@', "Azad");

    }
}