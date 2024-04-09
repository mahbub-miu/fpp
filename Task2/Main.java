package Task2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;
import static java.time.format.DateTimeFormatter.*;

public class Main {
    public static void main(String...args){
        Scanner sc = new Scanner(System.in);
        LocalDate dateOfBirth;
        DateTimeFormatter formatter = ofPattern("yyyy-MM-dd");

        System.out.println("Please, enter your first name:");
        String fName=sc.nextLine();

        System.out.println("please, enter your last name:");
        String lName = sc.nextLine();



        while (true) {
            System.out.println("please enter your birth date in the format -(yyyy-mm-dd) example 1989-04-14");
            String dateString = sc.nextLine();
            try {
                dateOfBirth = LocalDate.parse(dateString, formatter);
                HeartRates hr = new HeartRates(fName, lName, dateOfBirth);
                hr.calculateAge();
                hr.targetHearRateRange();
                System.out.println(hr);
                break;
            } catch (DateTimeParseException e) {
                System.out.println("Error! Please try again");
            }
        }

    }
}
