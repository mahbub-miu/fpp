package src.Task4;

public class SalariedEmployee extends Employee{
    private double weeklySalary;


    SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary){
        super(firstName,lastName,socialSecurityNumber);
        this.weeklySalary=weeklySalary;
    }

    public double getWeeklySalary(){return weeklySalary;}
    public void setWeeklySalary(double weeklySalary){this.weeklySalary=weeklySalary;}


    @Override
    public double getPayment(){
        return getWeeklySalary();
    }
    @Override
    public String toString(){
        return "First name : " + getFirstName() + "\nLast Name : " + getLastName() + "\nSocial Security Number : " + getSocialSecurityNumber() + "\nSalary : " + getPayment();
    }
}
