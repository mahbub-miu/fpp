package src.Problem2;

import java.util.List;

public class Statistics {

    public static double computeSumOfSalaries(List<EmployeeData> employees) {
        double totalSalary=0;
        for (EmployeeData employee : employees){

            totalSalary=employee.getSalary();
        }
        return totalSalary;
    }
}
