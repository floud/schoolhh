import java.math.BigInteger;

/**
 * Created by halturin_a on 22.09.2015.
 */
public class First {

    public static BigInteger rotateNumber(BigInteger a) {
        BigInteger result = BigInteger.valueOf(0);
        while (a.compareTo(BigInteger.ZERO) > 0) {
            result = result.multiply(BigInteger.valueOf(10)).add(a.divideAndRemainder(BigInteger.valueOf(10))[1]);
            a = a.divide(BigInteger.valueOf(10));
        }
        return result;
    }
    public static boolean isPalindrom(BigInteger a) {
        if (rotateNumber(a).compareTo(a) == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        BigInteger number;
        int count = 0;
        top: for (int i = 1; i < 12000; i++) {
            number = BigInteger.valueOf(i);
            for (int j = 0; j < 50; j++) {
                number = number.add(rotateNumber(number));
                if (isPalindrom(number)) {
                    continue top;
                }
            }
            System.out.println(i);
            count++;
        }
        System.out.println(count);
    }
}
