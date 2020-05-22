/* THIS IS THE FILE YOU SHOULD ADD TO AND THEN SUBMIT AS YOUR ANSWER */
/* TO QUESTION 1 OF THE INST1002 PROGRAMMING 1 MOCK LAB EXAM 2010/11      */
   
// ZooTickets.java

// Author: ****** ADD YOUR NAME HERE ****** 
    
/* This class is used to calculate the price of tickets of visitors to a city zoo  */




import java.util.Scanner;
import java.text.DecimalFormat;


public class ZooTickets
{
	
	
	final static int ADULT_TICKET_PRICE = 10;
	final static int CHILD_TICKET_PRICE = 8;
	final static double DONATION = 1.8;
	final static double MID_SEASON_DISCOUNT = 0.1;
        final static double LOW_SEASON_DISCOUNT = 0.2;


	
	
	public static void main (String[] args)
	{

		
		int numAdults = 0;
		int numChildren = 0;
		int numConcessions = 0;
		char ticketSeason ='p';
		char donate = 'n';
		double discountLevel = 0.0;
		boolean discount = false;
		double adultTicketCost = 0.0;
		double childTicketCost = 0.0;
		double concessionaryTicketCost = 0.0;
		double totalTicketPrice = 0.0;
		double totalNumberOfTickets = 0.0;
		double totalDonations = 0.0;
		
		
		
		Scanner scan = new Scanner(System.in);
	
		System.out.println("\nWelcome to City Zoo");	
		
		System.out.print("Are you visiting in peak, mid or low season (Enter p,m,l)?: ");
		ticketSeason = scan.next().charAt(0);
		
		System.out.print("Enter number of adults: ");	
		numAdults = scan.nextInt();

		System.out.print("Enter number of children: ");	
		numChildren = scan.nextInt();

		System.out.print("Enter number of concessions: ");
		numConcessions = scan.nextInt();
		
		System.out.print("Do you want to give a donation? (Enter y or n)?: ");
		donate = scan.next().charAt(0);
		

		switch (ticketSeason)
		{
			case 'l':
				discountLevel = LOW_SEASON_DISCOUNT;
				break;
			case 'm':
				discountLevel = MID_SEASON_DISCOUNT;
				break;
			default:
				discountLevel= 0;
		
		}
		
		// ADD YOUR CODE HERE

		// Print ticket prices
		
		totalTicketPrice = (adultTicketCost + childTicketCost + concessionaryTicketCost + totalDonations);

		DecimalFormat twoDecPlcFormatter = new DecimalFormat("##0.00");
		
		System.out.println("\n" + "\tAdult tickets:" + "\t\t\t" + twoDecPlcFormatter.format(adultTicketCost));
		System.out.println("\tChild tickets:" + "\t\t\t" + twoDecPlcFormatter.format(childTicketCost));
		System.out.println("\tConcessionary tickets:" +"\t\t" + twoDecPlcFormatter.format(concessionaryTicketCost));
		System.out.println("\tDonation:" + "\t\t\t" + twoDecPlcFormatter.format(totalDonations));
		System.out.println("\n\tTotal ticket price:" + "\t\t\t" + twoDecPlcFormatter.format(totalTicketPrice));
		
	}
}