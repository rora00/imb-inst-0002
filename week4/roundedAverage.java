import java.util.Scanner;
import java.text.DecimalFormat;

public class roundedAverage{
	public static void main(String[] args){
		// Ex. 1: printing using escape characters such as \" and \n
		System.out.println("\"SDK\" stands for \"Software Development Kit\", whereas\n\"IDE\" stands for \"Integrated Development Environment\".");
		
		// Ex. 2: reads 3 integers and prints average with 3 decimal places
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the first integer: ");
		int firstInteger = scan.nextInt();
		System.out.println("Enter the second integer: ");
		int secondInteger = scan.nextInt();
		System.out.println("Enter the third integer: ");
		int thirdInteger = scan.nextInt();
		
		DecimalFormat formatter = new DecimalFormat("0.000");
		double average = (((double)firstInteger + (double)secondInteger + (double)thirdInteger)/3);
		System.out.println("The average of" + firstInteger + secondInteger + thirdInteger + " is "+ formatter.format(average));	
	}
}