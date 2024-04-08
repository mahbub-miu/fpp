package Task2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import static java.time.format.DateTimeFormatter.*;

public class Main {
    public static void main(String...args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter your first name:");
        String fName=sc.nextLine();

        System.out.println("please, enter your last name:");
        String lName = sc.nextLine();

        System.out.println("please enter your birth date in the format -(yyyy-mm-dd) example 1989-04-14" +
                           " \nplease avoid inputting single digit for date or month like 1999-4-15 or 1999-12-9");
        String dateString=sc.nextLine();
        DateTimeFormatter formatter = ofPattern("yyyy-MM-dd");
        LocalDate dateOfBirth = LocalDate.parse(dateString,formatter);
        sc.close();


        HeartRates hr = new HeartRates(fName,lName,dateOfBirth);
        hr.calculateAge();
        hr.targetHearRateRange();
        System.out.println(hr);


    }
}
