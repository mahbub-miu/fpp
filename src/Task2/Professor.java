package src.Task2;

import java.time.LocalDate;

public class Professor extends DeptEmployee {
    int numberOfPublications;

    Professor(String name, LocalDate hireDate, double salary, int numberOfPublications){
        super(name, hireDate, salary);
        this.numberOfPublications=numberOfPublications;
    }

    public int getNumberOfPublications(){return numberOfPublications;}
    public void setNumberOfPublications(int numberOfPublications){this.numberOfPublications=numberOfPublications;}

//    @Override
//    public double computeSalary(){
//        return 1;
//    }

}
