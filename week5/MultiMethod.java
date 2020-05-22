import java.util.Scanner;
public class MultiMethod
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int var1 = scan.nextInt();
        System.out.print("Enter number 2: ");
        int var2 = scan.nextInt();
        System.out.print("Enter number 3: ");
        int var3 = scan.nextInt();

        int total = sum(var1, var2, var3);
        System.out.println(total);
        checkIfEven(total);
    }
    private static int sum(int x, int y, int z)
    {
        System.out.print("The sum of these numbers is: ");
        return (x + y + z);
    }
    private static boolean checkIfEven(int i)
    {
        if ((i % 2) == 0)
        {
            System.out.println("These numbers add up to an even number");
            return true;
        } 
        else
        {
            System.out.println("These numbers do not add up to an even number");
            return false;
        }
    }
}