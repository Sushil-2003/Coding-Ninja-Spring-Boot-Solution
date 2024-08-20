package com.example.Vaccination;

public interface User {

    /** This method returns Vaccine object which is selected by the user in console. **/
    Vaccine getVaccineDetails();

    /** This function sets user details such as name, age, and timeAndLocation. **/
    void setUserDetails(String name, int age, TimeAndLocation timeAndLocation);

    /** This function updates vaccination status of the user and prints appointment details in the console with includes user name , Vaccine name and lastly timeAndLocation class based details 
        For example:  "Hello John your appointment has been fixed for Covid Vaccine on  12 Pm at Mumbai  on 2023-05-10". 
     **/
    void setAppointment();

    /** This function returns a boolean type indicating the vaccination status of a user. If the user is vaccinated it should return true else false. **/
    boolean IsVaccinated();

}
