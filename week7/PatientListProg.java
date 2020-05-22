// PatientListProg.java
// Author: Rob Miller
// Program last changed: 21 September 2005
    
/* This program analyses information in a list patients.    */ 

import java.util.Scanner;
public class PatientListProg
{
   final static int AGE_LIMIT = 6, MAX_AGE = 120, LIST_SIZE = 3;
   
   //--------------------------------------------------------------------------
   //  Main - inputs and then analyses information in a list patients.
   //--------------------------------------------------------------------------
   public static void main(String[] args)
   {
      NamedPatient[] patientList = new NamedPatient[LIST_SIZE];
      for (int index = 0; index < patientList.length; index++)
      {
          patientList[index] = new NamedPatient();
          System.out.print("\n\tPATIENT " + (index + 1));
          inputDetails(patientList[index]);
      }
      outputStats(patientList);
   }
   
   //--------------------------------------------------------------------------
   //  Inputs the details of a patient passed as a parameter.
   //--------------------------------------------------------------------------
   private static void inputDetails(NamedPatient aPatient)
   {
      Scanner scan = new Scanner(System.in);
      System.out.print("\n\tEnter patient name: ");
      aPatient.setName(scan.nextLine());

      System.out.print("\tIs the patient allergic to gluten? (y/n): ");
      char yesOrNo = scan.next().charAt(0);
      while (yesOrNo != 'n' && yesOrNo != 'N' && yesOrNo != 'y' && yesOrNo != 'Y')
      {
         System.out.print("\tInput error - Is the patient allergic to gluten? (y/n): ");
         yesOrNo = scan.next().charAt(0);
      }
      if (yesOrNo == 'y' || yesOrNo == 'Y')
         aPatient.setAllergicToGluten(true);
          
      System.out.print("\tIs the patient pregnant? (y/n): ");
      yesOrNo = scan.next().charAt(0);
      while (yesOrNo != 'n' && yesOrNo != 'N' && yesOrNo != 'y' && yesOrNo != 'Y')
      {
         System.out.print("\tInput error - Is the patient pregnant? (y/n): ");
         yesOrNo = scan.next().charAt(0);
      }
      if (yesOrNo == 'y' || yesOrNo == 'Y')
         aPatient.setPregnant(true);
          
      System.out.print("\tEnter the patient\'s age in years: ");
      int age = scan.nextInt();
      while (age < 0 || age > MAX_AGE)
      {
         System.out.print("\tInput error - Enter the patient\'s age in years: ");
         age = scan.nextInt();
      }
      aPatient.setAge(age);
   }
         
   //--------------------------------------------------------------------------
   //  Outputs statistics for a patient list passed as a parameter.
   //--------------------------------------------------------------------------
   private static void outputStats(NamedPatient[] aPatientList)
   {
      System.out.print("\n\tAverage patient age: ");
      System.out.println(averageAge(aPatientList));
      System.out.print("\tPercentage with allergy to gluten: ");
      System.out.println(allergyPercentage(aPatientList) + "%");
      System.out.print("\tPercentage pregnant: ");
      System.out.println(pregnantPercentage(aPatientList) + "%");
      System.out.println();
   }

   //--------------------------------------------------------------------------
   //  Returns the average age of patients in the list passed as a parameter.
   //--------------------------------------------------------------------------
   private static int averageAge(NamedPatient[] aPatientList)
   {
      int totalAge = 0;
      for (int index = 0; index < aPatientList.length; index++)
      {
         totalAge += aPatientList[index].getAge();
      }
      return (int)((double)totalAge/aPatientList.length);
   }

   //--------------------------------------------------------------------------
   //  Returns the percentage of allergic patients in the list passed as a parameter.
   //--------------------------------------------------------------------------
   private static int allergyPercentage(NamedPatient[] aPatientList)
   {
      int totalAllergic = 0;
      for (int index = 0; index < aPatientList.length; index++)
      {
         if(aPatientList[index].getAllergicToGluten())
            totalAllergic++;
      }
      return ((totalAllergic * 100)/aPatientList.length);
   }

   //--------------------------------------------------------------------------
   //  Returns the percentage of pregnant patients in the list passed as a parameter.
   //--------------------------------------------------------------------------
   private static int pregnantPercentage(NamedPatient[] aPatientList)
   {
      int totalPregnant = 0;
      for (int index = 0; index < aPatientList.length; index++)
      {
         if (aPatientList[index].getPregnant())
            totalPregnant++;
      }
      return ((totalPregnant * 100)/aPatientList.length);
   }

}