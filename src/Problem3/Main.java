package src.Problem3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Marketing> marketingArrayList = new ArrayList<>();
        System.out.println("Add 10 new members to the marketing list");
        System.out.println("===================================================");
        marketingArrayList.add(new Marketing("Najib","Laptop",500));
        marketingArrayList.add(new Marketing("Paymen","Laptop",2000));
        marketingArrayList.add(new Marketing("Asad","Laptop",4000));
        marketingArrayList.add(new Marketing("Osama","Laptop",990));
        marketingArrayList.add(new Marketing("Hanok","Laptop",4000));
        marketingArrayList.add(new Marketing("Mahbub","Laptop",3000));
        marketingArrayList.add(new Marketing("Employee-6","Laptop",700));
        marketingArrayList.add(new Marketing("Employee-7","Laptop",460));
        marketingArrayList.add(new Marketing("Asad Rouf","Laptop",1900));
        marketingArrayList.add(new Marketing("Barek","Laptop",100));

        System.out.println("Diplay the list : \n"+marketingArrayList);

        System.out.println("Remove a person");
        System.out.println("===================================================");
        marketingArrayList.remove(3);
        System.out.println("One emplyee is deleted");
        System.out.println();


        System.out.println("Size of the lits");
        System.out.println("===================================================");
        System.out.println("size is : "+marketingArrayList.size());
        System.out.println();

        System.out.println("Sort the list");
        System.out.println("===================================================");
        Marketing.SaleaAmountComparator comparator = new Marketing.SaleaAmountComparator();
        Collections.sort(marketingArrayList,comparator);
        System.out.println(marketingArrayList);


        System.out.println("Filer and show employees list with sales amount more than 1000");
        System.out.println("===================================================");
        List<Marketing> highSales = listMoreThan1000(marketingArrayList);
        //highSales.sort(Comparator.comparing(Marketing::getEmployeeName));
        System.out.println(highSales);

    }

    public static List<Marketing> listMoreThan1000(List<Marketing> list){
        List<Marketing> highSalesList = new ArrayList<>();
        for (Marketing marketing : list) {
            if (marketing.salesamount >= 1000) {
                highSalesList.add(marketing);
            }
        }
        return highSalesList;
    }
}
