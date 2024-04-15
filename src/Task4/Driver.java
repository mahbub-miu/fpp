package src.Task4;

public class Driver {
    public static void main(String[] args) {
        Employee[] employees={new BasePlusCommissionEmployee("BasePlus","Employee-1","123=35-1111",50,20,400),
                              new BasePlusCommissionEmployee("BasePlus","Employee-2","123=35-2222",60,20,300),
                              new CommisionEmployee("CommissionEmployee","Employee-3","123=35-3333",80,20),
                              new HourlyEmployee("HourlyEmployee", "Employee-4", "123-35-4444",25,40),
                              new SalariedEmployee("SalariedEmployee","Employee-5","123-35-5555",1600)};

        double totalSalary=0;
        for(Employee employee:employees){
            System.out.println("\n"+employee);

            totalSalary+=employee.getPayment();
        }
        System.out.println("\nTotal Salary of all employees : "+totalSalary);

    }
}
