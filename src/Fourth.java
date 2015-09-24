import java.math.BigInteger;

/**
 * Created by halturin_a on 22.09.2015.
 */
public class Fourth {
    public static void main(String[] args) {
        int lastNumber = 1169 * 1169;
        int firstNumber = 1;
        int currentNumber = firstNumber;
        BigInteger summ = BigInteger.valueOf(0);
        int increment = 2;
        top: while (true) {
            for (int i = 0; i < 4; i++) {
                if (currentNumber > lastNumber) {
                    break top;
                } else {
                    summ = summ.add(BigInteger.valueOf(currentNumber));
                    currentNumber = currentNumber + increment;
                }
            }
            increment = increment + 2;
        }
        System.out.println(summ);
    }
}
