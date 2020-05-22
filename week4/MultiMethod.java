import java.util.Scanner;
public class MultiMethod
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int var1 = scan.nextInt();
        int var2 = scan.nextInt();
        int var3 = scan.nextInt();

        int junaid = sum(var1, var2, var3);
        if ((junaid % 2) == 0)
        {
            System.out.println(junaid);
        }
    }
    public static int sum(int x, int y, int z)
    {
        return (x + y + z);
    }
}