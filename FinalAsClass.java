package com.keyword;

final class CovidPatientsVaccinationDetails
{
    int RegisteredId = 1;
    int Age = 30;
    String Gender = "Male";
    String Dose = "1";
    String VaccineName = "Covid shield";
    public void Display()
    {
        System.out.println("Vaccination Details: ");
        System.out.println("RegisteredID : " + RegisteredId);
        System.out.println("Age : " + Age);
        System.out.println("Gender : " + Gender);
        System.out.println("Dose : " + Dose);
        System.out.println("VaccineName : " + VaccineName);
    }


}
/*class CovidPatientsNonVaccinationDetails extends CovidPatientsVaccinationDetails
{
    If we try to inherit the class CovidPatientsVaccinationDetails in CovidPatientsNonVaccinationDetails
    we will get error.
}*/

public class FinalAsClass
{
    public static void main(String[] args)
    {
    CovidPatientsVaccinationDetails  patients = new CovidPatientsVaccinationDetails();
    patients.Display();
    }
}
