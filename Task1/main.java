package Task1;

public class main {
    public static void main(String...args){

        //create address
        Address billingAddress1 = new Address("305 S Main ST", "Fairfield","Iowa","52556");
        Address shippingAddress1 = new Address("44 Campus drive", "Buffalo","New york","12345");

        Address billingAddress2 = new Address("Main ST", "Chicago","IL","60601");
        Address shippingAddress2 = new Address("Main ST", "Chicago","IL","60601");

        Address billingAddress3 = new Address("North Blvd Main", "Cupertino","CA","987012");
        Address shippingAddress3 = new Address("North Blvd Main", "Cupertino","CA","987012");


        //create customers
        Customer cs1=new Customer("Osama","Abdullah","913-65-4053");
        Customer cs3=new Customer("Hemok","M","913-65-4054");
        Customer cs2=new Customer("Mahbub","Hossain","913-65-4054");
        cs1.setBillingAddress(billingAddress1);
        cs1.setShippingAddress(shippingAddress1);
        cs2.setShippingAddress(shippingAddress2);
        cs2.setBillingAddress(billingAddress2);
        cs3.setBillingAddress(billingAddress3);
        cs3.setShippingAddress(shippingAddress3);

        Customer[] customerArray={cs1,cs2,cs3};



        //print customer
        for(Customer cs: customerArray){
            if(cs.getBillingAddress().getCity().equals("Chicago")){
                //System.out.println(cs.toString());
                System.out.println(cs);
            }

        }
    }
}
