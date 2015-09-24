import java.math.BigInteger;

/**
 * Created by halturin_a on 22.09.2015.
 */
public class Third {
    public static void main(String[] args) {
        BigInteger sum = BigInteger.valueOf(0);
        BigInteger currVal;
        for (int i = 1; i <= 1174; i++) {
            currVal = BigInteger.valueOf(i);
            sum = sum.add(currVal.pow(i));
        }
        String s = String.valueOf(sum);
        System.out.println(s.substring(s.length() - 10));
    }
}
