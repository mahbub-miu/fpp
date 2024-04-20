package src.Problem1;

public class Person {
    private String lastName, firstName;
    private int age;

    public Person(String lastName, String firstName, int age) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.age = age;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person [lastName=" + lastName +", "+ "FirstName=" + firstName + ", "+"Age=" + age + "]";
    }
}
