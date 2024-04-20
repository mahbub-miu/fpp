package src.Problem1;

public class Main {
    public static void main(String[] args) {
        MyPersonList personList = new MyPersonList();

        //add 2 persons to the list
        System.out.println();
        System.out.println("Add two persons in the list for first time");
        System.out.println("===================================================");
        personList.addPerson(new Person("Hossain","Mahbub",45));
        personList.addPerson(new Person("Osama","Mohammed",40));

       // check two persons added correctly or not
        System.out.println("Check added person in the list:");
        System.out.println(personList.toString());
        System.out.println();
//
//      //insert one person between these two person - (index-1 )
        System.out.println("Check Insert functionality");
        System.out.println("===================================================");
        personList.insertPerson(new Person("Hanok","Micheil",35),1);
        System.out.println("Check inserted person in the list is added correctly or not");
        System.out.println("List should have Hossain>>Hanok>>Osama");
        System.out.println(personList.toString());
        System.out.println();
//
//      //Check the size function. Expected size 3
        System.out.println("Check Size of the Person List");
        System.out.println("===================================================");
        System.out.println("Expected size 3");
        System.out.println("List size : "+personList.size());
        System.out.println();
//
//     //check resize functionality ///////////////////////////
        System.out.println("Checking resizing functionality of the array by adding person one by one");
        System.out.println("==========================================================================");
        System.out.println("Number of person in the list : "+personList.size());
        System.out.println("Array size : "+personList.getArraySize());
        personList.addPerson(new Person("Person-4","Test",40));
        System.out.println("Added Test person-4");
        System.out.println("List size after add: "+personList.size());
        System.out.println("Array size : "+personList.getArraySize());
        System.out.println("After this point resizing should be initiated as initial size was 4");
        personList.addPerson(new Person("Person-5","Test",50));
        System.out.println("added Test Person-5");
        System.out.println("List Size after add: "+personList.size());
        System.out.println("Array Size is increased to : "+personList.getArraySize());
        System.out.println();
//
//      // check find functionality
        System.out.println("Check find person by last name");
        System.out.println("=========================================================");
        System.out.println("Looking for Hanok. Expected result is True. and actual result is : "+personList.findPerson("Hanok"));
        System.out.println();


//      //Check remove functionality - remove Test Person-4
        System.out.println("Test Remove functionality");
        System.out.println("=========================================================");
        System.out.println("removing person by last name.....");
        personList.removePerson("Person-4");
        System.out.println("Person-4 is removed");
        System.out.println("List after remove the person: ");
        System.out.println(personList.toString());

        //check empty method. expected result false
        System.out.println();
        System.out.println("Check Empty Method");
        System.out.println("===================================================");
        System.out.println("Is the person list is empty? True if empty otherwise false");
        System.out.println("Result : "+personList.isEmpty());
        System.out.println();
//

    }
}
