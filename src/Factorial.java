import java.math.BigInteger;

public class Factorial {
    public static BigInteger factorial(int value) {
        if (value <= 1) {
            return BigInteger.ONE;
        } else {
            return BigInteger.valueOf(value).multiply(factorial(--value));
        }
    }
}
