// write a program that can calculate if the year input by the user is a leap year
import java.util.Scanner;

public class leapYear {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = scanner.nextInt();
        int leap = year % 4;

        switch (leap) {
            case 0:
                System.out.println(year + " is a leap year");
                break;
            default:
                System.out.println(year + " is not a leap year");
        }
    }
}