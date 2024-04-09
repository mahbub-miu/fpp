package Task2;

import java.time.LocalDate;
import java.time.Period;

class HeartRates {
    private final int RHR=70;  //Resting Heart Rate
    private final float LB=0.5f; //lowerBoundary
    private final float UB=0.85f; //upperBoundary

    private String firstName;
    private String lastName;
    LocalDate dob;
    int ageInYears;

    HeartRates(String firstName, String lastName, LocalDate dob){
        this.firstName=firstName;
        this.lastName=lastName;
        this.dob=dob;
    }

    public String getFirstName(){
        return firstName;
    }
     void setFirstName(String firstName){
        this.firstName=firstName;
    }

     String getLastName(){
        return lastName;
    }
     void setLastName(String lastName){
        this.lastName=lastName;
    }
    LocalDate getDob(){
        return dob.plusDays(0);
    }

    int calculateAge(){
        LocalDate currentDate =LocalDate.now();
        Period pd =Period.between(getDob(),currentDate);
        ageInYears=pd.getYears();
        return ageInYears;

    }

    int calculateMaxHearRate(int age){
        return 220-age;
    }

    void targetHearRateRange(){

        /*
            Calculate Average Heart Rate (AHR)
            - Formula: (AHR) = MHR (Maximum Heart Rate) – RHR (Resting Heart Rate)
            - Here we have method "calculateMaxHearRate(int age)" to calculate the Maximum Heart rate
                - this method needs age as input. Age is calculated using "calculateAge(LocalDate dob)" method
            - Resting Heart Rate is a constant
         */
        int AHR = calculateMaxHearRate(ageInYears) - RHR;
        double LBTHR = (AHR*LB)+RHR;  // Lower Boundary Target Heart Rate
        double UBTHR=(AHR*UB)+RHR;   // Upper Boundary Target Heart Rate
        System.out.println("The Target Heart Rate Range is between "+LBTHR+" and "+UBTHR);

    }

    @Override
    public String toString(){
        return "First Name: "+firstName+"\nLast Name: "+lastName+"\nage: "+ageInYears;
    }
}
