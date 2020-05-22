import java.util.Scanner;

public class TimeConverter{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		final int SECONDS_IN_HOUR = 3600, SECONDS_IN_MINUTE = 60;
		int answer, answer2, answer3, seconds;
		
		System.out.println("Enter a number of seconds: ");
		seconds = scan.nextInt();
		
		answer = seconds / SECONDS_IN_HOUR;
		System.out.println(answer);
		answer2 = seconds % SECONDS_IN_HOUR;
		answer2 /= SECONDS_IN_MINUTE;
		System.out.println(answer2);
		answer3 = seconds % SECONDS_IN_MINUTE;
		System.out.println(answer3);
	}
}