package src.Task4;

public class BasePlusCommissionEmployee extends CommisionEmployee{
    private double baseSalary;
    BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate, double baseSalary){
        super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
        this.baseSalary=baseSalary;
    }

    public double getBaseSalary(){return baseSalary;}
    public void setBaseSalary(double baseSalary){this.baseSalary=baseSalary;}
    @Override
    public double getPayment(){
        return  getBaseSalary()+getGrossSales() * getCommissionRate();
    }
    @Override
    public String toString(){
        return "First name : " + getFirstName() + "\nLast Name : " + getLastName() + "\nSocial Security Number : " + getSocialSecurityNumber() + "\nSalary : " + getPayment();
    }
}
