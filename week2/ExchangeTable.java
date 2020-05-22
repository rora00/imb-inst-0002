// ExchangeTable.java
// Author: Rob Miller
// Program last changed: 21 September 2005
    
/* This program prints a 3 line pounds/euros exchange table.             */ 

import java.util.Scanner;
import java.text.DecimalFormat;
public class ExchangeTable
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      final double EXCHANGE_RATE_GBPEUR = 1.564;
      final double EXCHANGE_RATE_GBPUSD = 1.5587;
      System.out.print("\nEnter a starting amount in UK sterling: ");
      double ukAmount = scan.nextDouble();
      DecimalFormat twoDecPlcFormatter = new DecimalFormat("0.00");      
      System.out.println("\n\tPOUNDS\t\tEUROS\t\tUSD");
      System.out.print("\t" + twoDecPlcFormatter.format(ukAmount) + "\t\t");
      System.out.print(twoDecPlcFormatter.format(ukAmount*EXCHANGE_RATE_GBPEUR) + "\t\t");
      System.out.println(twoDecPlcFormatter.format(ukAmount*EXCHANGE_RATE_GBPUSD));
      ukAmount = ukAmount + 10;
      System.out.print("\t" + twoDecPlcFormatter.format(ukAmount) + "\t\t");
      System.out.print(twoDecPlcFormatter.format(ukAmount*EXCHANGE_RATE_GBPEUR) + "\t\t");
      System.out.println(twoDecPlcFormatter.format(ukAmount*EXCHANGE_RATE_GBPUSD));
      ukAmount = ukAmount + 10;
      System.out.print("\t" + twoDecPlcFormatter.format(ukAmount) + "\t\t");
      System.out.print(twoDecPlcFormatter.format(ukAmount*EXCHANGE_RATE_GBPEUR) + "\t\t");
      System.out.println(twoDecPlcFormatter.format(ukAmount*EXCHANGE_RATE_GBPUSD));
      System.out.println();
   }
}