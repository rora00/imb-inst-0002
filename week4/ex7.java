import java.util.Scanner;

public class ex7
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of lines for the triangle: ");
        int height = scan.nextInt();

        for (int i = 1; i <= height; i++) //prints 'height' number of lines
        {
            for(int j = height; j >= i; j--) //so long as j is more than i, it keeps printing stars, then j reduces by 1
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}