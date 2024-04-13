package src.Task2;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DeptEmployee[] deptEmployees = new DeptEmployee[5];
        deptEmployees[0] = new Professor("Professor-1", LocalDate.of(2020, 10, 15), 5000, 10);
        deptEmployees[1] = new Professor("Professor-2", LocalDate.of(2020, 10, 15), 5000, 20);
        deptEmployees[2] = new Professor("Professor-3", LocalDate.of(2020, 10, 15), 5000, 30);
        deptEmployees[3] = new Secretary("Secretary-1", LocalDate.of(2020, 10, 15), 2000, 100);
        deptEmployees[4] = new Secretary("Secretary-2", LocalDate.of(2020, 10, 15), 2000, 100);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to see the sum of all Professor and Secretary salary in the department?");
        String choice = scanner.nextLine();
        if (choice.charAt(0) == 'Y') {
            showSalary(deptEmployees);
        }
    }

        public static void showSalary(DeptEmployee[] deptEmployees){
             double totalSalary=0;
             for(DeptEmployee emp:deptEmployees){
                 totalSalary+= emp.computeSalary();
             }
            System.out.println("Total salary of all employees in the department: "+totalSalary);
        }

    }
