import java.util.Scanner;
public class ex6
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("\nEnter start year: ");
        int startYear = scan.nextInt();
        System.out.println("Enter end year: ");
        int endYear = scan.nextInt();

        while(ex6.isLeapYear(startYear) == false)
        {
            startYear++;
        }
        startYear += 4;
        while(ex6.isLeapYear(endYear) == false)
        {
            endYear++;
        }
        System.out.println("\nHere is a list of leap years between " + startYear + " and " + endYear + " :\n");
        for(int i = startYear; i < endYear;)
        {
            for(int counter = 0; counter <= 10; counter++)
            {
                System.out.print(i);
                if(i < endYear)
                {
                    System.out.print(", ");
                } else {
                    System.out.print(".\n\n");
                    return;
                }
                i+=4;
                if(i > endYear)
                {
                    return;
                } 
            }
            System.out.println("\n");
        }
    }
    private static boolean isLeapYear(int value)
    {
        if((value % 4) == 0)
        {
            return true;
        } else {
            return false;
        }    
    }
}