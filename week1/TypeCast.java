import java.text.DecimalFormat;
import java.util.Random;
public class TypeCast {
    public static void main(String[] args) {
        int average;
        Random rand = new Random();
        int[] numbers = {1, 2, 3, 4};
        int[] blankArray = new int[numbers.length];
        for(int i = 0; i < blankArray.length; i++) {
            int truly = blankArray[i];
            truly = (truly + (int)rand.nextInt() + 10) / blankArray.length;            
        }  
        System.out.println((int)truly);
    }
}