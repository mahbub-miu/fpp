package src.Problem3;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class Marketing {
    String employeename;
    String productname;
    double salesamount;

    public Marketing(String employeename, String productname, double salesamount) {
        this.employeename = employeename;
        this.productname = productname;
        this.salesamount = salesamount;
    }

    public String getEmployeename() {
        return employeename;
    }

    public void setEmployeename(String employeename) {
        this.employeename = employeename;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public double getSalesamount() {
        return salesamount;
    }

    public void setSalesamount(double salesamount) {
        this.salesamount = salesamount;
    }

    @Override
    public boolean equals(Object obj){
        if(this==obj) return true;
        if(obj==null || this.getClass()!=obj.getClass()) return false;
        Marketing marketing=(Marketing) obj;
        return Double.compare(salesamount,marketing.salesamount)==0 && employeename.equals(marketing.employeename)
                && Objects.equals(this.getProductname(), marketing.getProductname());
    }

    @Override
    public String toString() {
        return "Employee name= " + employeename +" Product name=" + productname  + " Sales amount=" + salesamount +"\n";
    }

    public static class SaleaAmountComparator implements Comparator<Marketing> {

        @Override
        public int compare(Marketing marketing1, Marketing marketing2) {
            return Double.compare(marketing1.salesamount, marketing2.salesamount);
        }
    }
}
