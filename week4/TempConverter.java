//********************************************************************
//  TempConverter.java       Author: Lewis/Loftus
//
// 
//  Computes the Fahrenheit equivalent of a specific Celsius
//  value using the formula F = (9/5)C + 32.
//
//********************************************************************

import java.util.Scanner;
import java.text.DecimalFormat;

public class TempConverter
{
   public static void main (String[] args)
   {
      Scanner scan = new Scanner(System.in);
      final int BASE = 32;
      final double CONVERSION_FACTOR = 9.0 / 5.0;

      double celciusTemp;
      int farenheitTemp;  // value to convert
      
      System.out.print ("\nEnter temperature in Farenheit: ");
      farenheitTemp = scan.nextInt();

      celciusTemp = (farenheitTemp - BASE) / CONVERSION_FACTOR;
      
      DecimalFormat formatter = new DecimalFormat("0.0"); //rounds celcius to 1 d.p
      System.out.println ("Farenheit Temperature: " + farenheitTemp);
      System.out.println ("Celcius Equivalent: " + formatter.format(celciusTemp));
   }
}