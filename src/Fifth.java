import java.math.BigInteger;

/**
 * Created by halturin_a on 22.09.2015.
 */
public class Fifth {
    public static void main(String[] args) {
        System.out.println(fib(1461));
    }

    public static int fib(int length) {
        int k = 2;
        BigInteger previous = BigInteger.ONE;
        BigInteger current = BigInteger.ONE;
        BigInteger temp;
        while (true) {
            k++;
            temp = current;
            current = previous.add(current);
            previous = temp;
            if (current.toString().length() == length) {
                //System.out.println(current);
                return k;
            }
        }
    }
}
