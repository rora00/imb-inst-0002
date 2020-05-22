// RandomTickets.java
// Author: Rob Miller
// Program last changed: 21 September 2005
    
/*  This program prints your lottery ticket
    Where you have 1/15 chance of winning 3 tickets
    Where you have 2/15 chance of winning 2 tickets
    Where you have 4/15 chance of winning 1 tickets
    use .random() method from math object and if-else statements
*/ 
import java.util.Random;

public class randomTickets
{
   public static void main(String[] args)
   {
        final int MIN = 0, MAX = 15;
        int ticketQuantity;
        int randomNumber = ((int)(Math.random() * (MAX + 1 - MIN))) + MIN;
        System.out.println("Your lottery ticket number is: " + randomNumber);

        if (randomNumber == 1)
            ticketQuantity = 3;
        else if (randomNumber == 2 || randomNumber == 3)
            ticketQuantity = 2;
        else if (randomNumber >= 4 && randomNumber <=7)
            ticketQuantity = 1;
        else
            ticketQuantity = 0;
        
        System.out.print("You have won " + ticketQuantity);
        if (ticketQuantity == 1) {
            System.out.println(" ticket");
        } else {
            System.out.println(" tickets");    
        }  
        
        /*  This program prints your lottery ticket
        Where you have 1/15 chance of winning 3 tickets
        Where you have 2/15 chance of winning 2 tickets
        Where you have 4/15 chance of winning 1 tickets
        use Random class and Random Object and switch statements
        make ticket/tickets checker using conditional operators
        */ 

        Random numberGenerator = new Random();

        final int MIN1 = 0, MAX1 = 15;
        int y; //y is the ticket quantity
        int x = numberGenerator.nextInt(MAX1)+ MIN1; //is the randomly generated number
        System.out.println("In your second lottery attempt, your lottery ticket number is: " + x);

        switch (x) {
            case 1:
                y = 3;
                break;
            case 2:
            case 3:
                y = 2;
                break;
            case 4:
            case 5:
            case 6:
            case 7:
                y = 1;
                break;
            default:
                y = 0;
        }
        System.out.print("You have won " + y);
        System.out.println(y == 1 ? " ticket" : " tickets");
   }
}