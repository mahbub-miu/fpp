package src.Task4;

public class CommisionEmployee extends Employee {
    private double grossSales;
    private double commissionRate;

    CommisionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate){
        super(firstName,lastName,socialSecurityNumber);
        this.grossSales=grossSales;
        this.commissionRate=commissionRate;
    }

    public double getGrossSales(){return grossSales;}
    public void setGrossSales(double grossSales){this.grossSales=grossSales;}
    public double getCommissionRate(){return commissionRate;}
    public void setCommissionRate(double commissionRate){this.commissionRate=commissionRate;}

    @Override
    public double getPayment(){
        return  getGrossSales() * getCommissionRate();
    }
    @Override
    public String toString(){
        return "First name : " + getFirstName() + "\nLast Name : " + getLastName() + "\nSocial Security Number : " + getSocialSecurityNumber() + "\nSalary : " + getPayment();
    }
}
