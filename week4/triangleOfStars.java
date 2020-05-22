import java.util.Scanner;

public class triangleOfStars {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Height of Triangle");
		int height = scan.nextInt();
		
		System.out.println("Triangle");
		for(int i = 1; i <= height; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("\nUpside-down");	
		for(int k = 1; k <= height; k++) {
			for(int l = height; l >= k; l--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("\nPyramid");
		for(int m = 1; m <= height; m++) {
			for(int n = height; n >= m; n--) {
				System.out.print(" ");
			}
			for(int o = 1; o <= m; o++) {
				System.out.print("*");
			}
			for (int p = 1; p <= m; p++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}