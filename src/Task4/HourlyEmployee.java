package src.Task4;

public class HourlyEmployee extends Employee {
    private double wage;
    private double hours;

    HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double wage, double hours){
        super(firstName,lastName,socialSecurityNumber);
        this.wage=wage;
        this.hours=hours;
    }

    public double getWage(){return wage;}
    public void setWage(double grossSales){this.wage=grossSales;}
    public double getHours(){return hours;}
    public void setHours(double commissionRate){this.hours=hours;}

    @Override
    public double getPayment(){
        return  getWage() * getHours();
    }
    @Override
    public String toString(){
        return "First name : " + getFirstName() + "\nLast Name : " + getLastName() + "\nSocial Security Number : " + getSocialSecurityNumber() + "\nSalary : " + getPayment();
    }
}
