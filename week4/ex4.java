import java.util.Scanner;

public class ex4
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of lines for the triangle: ");
        int height = scan.nextInt();

        for (int i = 1; i <= height; i++) //prints 'height' number of lines
        {
            for(int j = 0; j < i; j++) //prints the star 'i' number of times
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}