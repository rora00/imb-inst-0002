import java.util.Scanner;

public class ex8
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of lines for the triangle: ");
        int height = scan.nextInt();

        for (int i = 1; i <= height; i++) //prints 'height' number of lines
        {
            for (int j = height; j >= i; j--) //prints blank spaces in upside down triangle shape
            {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) //prints right side up triangle starting at 1
            {
                System.out.print("*");
            }
            for (int l = 1; l < i; l++) //prints triangle facing other way starting at 0
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public boolean tooManyLines(int height)
    {
        if (height > 40)
        {
            System.out.println("Too many lines, try again");
            scan.nextInt();
        }
    }
}