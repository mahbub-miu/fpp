package src.Problem1;

import java.util.Arrays;

public class MyPersonList {
    private final int INITIAL_SIZE = 4;
    private Person[] currentArr;
    private int numberOfPersons;

    MyPersonList() {
        currentArr = new Person[INITIAL_SIZE];
        numberOfPersons = 0;
    }

    public void addPerson(Person person) {
        if (person == null) return;
        if (numberOfPersons == currentArr.length) resize();
        currentArr[numberOfPersons] = person;
        ++numberOfPersons;
    }

    public void insertPerson(Person person, int pos) {
        if (person == null) return;
        if (pos < 0 || pos > numberOfPersons) return;
        if (numberOfPersons == currentArr.length) {
            resize();
        }
        Person[] temp = new Person[currentArr.length];
        System.arraycopy(currentArr, 0, temp, 0, pos);
        temp[pos] = person;
        System.arraycopy(currentArr, pos, temp, pos + 1, currentArr.length - (pos + 1));
        currentArr = temp;
        ++numberOfPersons;
    }

    public boolean removePerson(String lastName) {
        if (lastName == null || numberOfPersons == 0) return false;

        int pos = -1;
        for (int i = 0; i < numberOfPersons; i++) {
            if (currentArr[i].getLastName().equals(lastName)) {
                pos = i;
                break;
            }
        }
        if (pos == -1) return false;
        Person[] temp = new Person[currentArr.length];
        System.arraycopy(currentArr, 0, temp, 0, pos);
        System.arraycopy(currentArr, pos + 1, temp, pos, currentArr.length - (pos + 1));
        currentArr = temp;
        --numberOfPersons;
        return true;
    }

    public Person getPerson(int pos) {
        if (pos < 0 || numberOfPersons == 0) return null;
        return currentArr[pos];
    }

    public boolean findPerson(String LastName) {
        if (LastName == null || numberOfPersons == 0) return false;
        int pos = -1;

        for (int i = 0; i < numberOfPersons; i++) {
            if (currentArr[i].getLastName().equals(LastName)) {
                return true;
            }
        }
        return false;
    }

    public int size() {
        return numberOfPersons;
    }

    public boolean isEmpty() {
        return (numberOfPersons == 0);
    }
    public void resize(){
        System.out.println("resizing.............");
        Person[] temp=new Person[currentArr.length*2];
        System.arraycopy(currentArr,0,temp,0,currentArr.length);
        currentArr=temp;
        System.out.println("resizing is done. You may proceed. Thank you...........");
    }
    public Object clone() {
            return Arrays.copyOf(currentArr, numberOfPersons);

    }

    public int getArraySize(){
        return currentArr.length;


    }

    @Override
    public String toString(){
        StringBuilder sb=new StringBuilder("[");
        for(int i=0;i<numberOfPersons-1; ++i){
            sb.append(currentArr[i]+"\n");
        }
        sb.append(currentArr[numberOfPersons-1]+"]");
        return sb.toString();
    }
}
