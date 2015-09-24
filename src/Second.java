import java.math.BigInteger;

/**
 * Created by halturin_a on 22.09.2015.
 */
public class Second {
    public static void main(String[] args) {
        int count = 0;
        for (int n = 1; n < 186; n++) {
            for (int k = 1; k < n; k++) {
                if (factorial(n).divide((factorial(k).multiply(factorial(n - k)))).compareTo(BigInteger.valueOf(1000000)) > 0) {
                    count++;
                    System.out.println(n + " " + k);
                    continue;
                }
            }
        }
        System.out.println(count);
    }

    public static BigInteger factorial(int a) {
        if (a == 1) {
            return BigInteger.valueOf(1);
        }
        return factorial(a - 1).multiply(BigInteger.valueOf(a));
    }
}
