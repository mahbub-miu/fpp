package src.Task2;

import java.time.LocalDate;

public class Secretary extends DeptEmployee{
    double overtimeHours;

    Secretary(String name, LocalDate hireDate, double salary, double overtimeHours){
        super(name, hireDate, salary);
        this.overtimeHours=overtimeHours;
    }

    public double getOvertimeHours(){return overtimeHours;}
    public void setOvertimeHours(double overtimeHours){this.overtimeHours=overtimeHours;}

    @Override
    public double computeSalary(){
        salary=super.salary+12*overtimeHours;          //salary plus 12 times the number of overtime hours.
        return salary;
    }

}
