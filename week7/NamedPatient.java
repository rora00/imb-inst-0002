// Named Patient.java
// Author: Rob Miller
// Program last changed: 21 September 2005, edited to NamedPatient
    
/* This class represents a patient taking medicine.      */ 

public class NamedPatient
{
    private String name;
    private int age;
    private boolean allergicToGluten;
    private boolean pregnant;
   
   
   //--------------------------------------------------------------------------
   //  Constructor - sets default values for age, allergicToGluten and pregnant.
   //--------------------------------------------------------------------------
   public NamedPatient ()
   {
        name = "";
        age = 0;
        allergicToGluten = false;
        pregnant = false;
   }
   
   //--------------------------------------------------------------------------
   //  Sets name to the value of the parameter
   //--------------------------------------------------------------------------
   public void setName (String nameValue) 
    {
        name = nameValue;
    }

   //--------------------------------------------------------------------------
   //  Sets age to the value of the parameter.
   //--------------------------------------------------------------------------
   public void setAge (int ageValue)
   {
      age = ageValue;
   }
   
   //--------------------------------------------------------------------------
   //  Sets allergicToGluten to the value of the parameter.
   //--------------------------------------------------------------------------
   public void setAllergicToGluten (boolean glutenValue)
   {
      allergicToGluten = glutenValue;
   }
   
   //--------------------------------------------------------------------------
   //  Sets pregnant to the value of the parameter.
   //--------------------------------------------------------------------------
   public void setPregnant (boolean pregnantValue)
   {
      pregnant = pregnantValue;
   }

   //--------------------------------------------------------------------------
   //  Returns name.
   //--------------------------------------------------------------------------
   public String getName ()
   {
      return name;
   }

   //--------------------------------------------------------------------------
   //  Returns the current value of age.
   //--------------------------------------------------------------------------
   public int getAge ()
   {
      return age;
   }
   
   //--------------------------------------------------------------------------
   //  Returns the current value of allergicToGluten.
   //--------------------------------------------------------------------------
   public boolean getAllergicToGluten ()
   {
      return allergicToGluten;
   }
   
   //--------------------------------------------------------------------------
   //  Returns the current value of pregnant.
   //--------------------------------------------------------------------------
   public boolean getPregnant ()
   {
      return pregnant;
   }
   
}