import java.util.Scanner;
public class ageCalc
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int yearNow, monthNow, yearNowInMonths, yearAge, monthBirth, yearAgeInMonths, yearFuture, monthFuture, yearFutureInMonths, ageYearFuture, ageMonthFuture;
        final int MONTHS_IN_YEAR = 12;      

        System.out.println("Enter current year");
        yearNow = scan.nextInt(); //2019
        System.out.println("Enter current month (from 1-12)");
        monthNow = scan.nextInt(); //2
        yearNowInMonths = (yearNow * MONTHS_IN_YEAR) + monthNow;

        System.out.println("Enter age in years");
        yearAge = scan.nextInt(); //18
        System.out.println("Enter birth month (from 1-12)");
        monthBirth = scan.nextInt(); //june - 6
        yearAgeInMonths = ((yearNow - yearAge) * MONTHS_IN_YEAR) - monthBirth;

        System.out.println("Which year would you like to find out your age for?");
        yearFuture = scan.nextInt(); //2050
        System.out.println("Which month specifically? (from 1-12)");
        monthFuture = scan.nextInt(); //october - 10
        yearFutureInMonths = (yearFuture * MONTHS_IN_YEAR) + monthFuture;

        if (ageCalc.yearChecker(yearNow, yearFuture) == false || ageCalc.monthChecker(monthNow, monthBirth, monthFuture) == false) 
        {
            System.out.println("Errors with inputs detected. Please retry");
            System.exit(0);
        }
        
        /* ageYearFuture = (yearFutureInMonths - yearAgeInMonths) / MONTHS_IN_YEAR; //50 years
        ageMonthFuture = (yearFutureInMonths - yearAgeInMonths) % MONTHS_IN_YEAR; //4 months */

        int result[] = ageCalc.finalAnswer(yearFutureInMonths, yearAgeInMonths, MONTHS_IN_YEAR);

        if (result[0] <= 150 && result[0] >=0)
            System.out.println("You will be " + result[0] + " years and " + result[1] + " months old.");
        else if (result[0] > 150)
            System.out.println("Sorry, but you'll probably be dead by " + yearFuture + ".");
        else
            System.out.println("You weren't born in " + yearFuture + ".");
    }
    private static boolean yearChecker(int i, int j)
    {
        if ((i < 3000 && i > 0) && (j < 3000 && j > 0))
            return true;
        else 
            return false;   
    }
    private static boolean monthChecker(int i, int j, int k)
    {
        if((i > 1 && i < 12) && (j > 1 && i < 12) && (k > 1 && k < 12))
            return true;
        else
            return false;
    }
    private static int[] finalAnswer(int j, int k, int l)
    {
        int ageYearFuture = (j - k) / l;
        int ageMonthFuture = (j - k) % l;
        return new int[] {ageYearFuture, ageMonthFuture};
    }
}