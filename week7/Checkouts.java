// Checkouts.java
// Author: Rob Miller
// Program last changed: 16 Octorber 2005
    
/* This program stores takings for a list of checkout desks.    */ 

import java.util.Scanner;
import java.text.DecimalFormat;
public class Checkouts
{
   static final int NUMBER_OF_CHECKOUTS = 6, MAX_TAKING = 1000000, EXPENSIVE = 3000;
   public static void main(String[] args)
   {
        Scanner scan = new Scanner(System.in);
        DecimalFormat rounder = new DecimalFormat("0.00");
        //double array containing 6 elements
        double[] checkoutList = new double[NUMBER_OF_CHECKOUTS];
        double total = 0.0; 
        int totalExpensive = 0;
        System.out.println();

        for (int index = 0; index < checkoutList.length; index++) {
            System.out.print("\tEnter takings for checkout number ");
            System.out.print((index + 1) + ": ");
            checkoutList[index] = scan.nextDouble();
            while (checkoutList[index] < 0 || checkoutList[index] > MAX_TAKING) {
                System.out.print("\tImpossible! - enter takings for checkout number ");
                System.out.print((index + 1) + " again: ");
                checkoutList[index] = scan.nextDouble();
            }
            total += checkoutList[index];
        }
        System.out.println("\n\tThe total of takings for the supermarket is: " + rounder.format(total) + ".");
        System.out.println();

        //shows how many purchases are expensive
        for(int index = 0; index < checkoutList.length; index++) {
            if (checkoutList[index] > EXPENSIVE) {
                totalExpensive++;
            }
        }
        //shows shopper the expensive purchases (>$3000)
        System.out.println("\t" + totalExpensive + " checkouts have taken more than " + EXPENSIVE + " pounds:");
        for(int index = 0; index < checkoutList.length; index++) {
            if (checkoutList[index] > EXPENSIVE) {
                System.out.println("\t\tCheckout number " + (index + 1));
            }
        }
    }
}