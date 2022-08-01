import java.lang.reflect.Array;
import java.util.Arrays;

public class PrintOddNumbers {
public static void printOddNumbers(int[] arr) {
    StringBuilder oddNumbers = new StringBuilder();
    String a = "";
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] % 2 == 1 || arr[i] % 2 == -1) {
            oddNumbers.append(a + arr[i]);
            a = ",";
        }
//        a = ",";
    }
    System.out.println(oddNumbers);
}
}
