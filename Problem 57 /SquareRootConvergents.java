import java.math.BigInteger;

public class SquareRootConvergents {

    public static void main(String[] args) {

        int count = 0;

        BigInteger numerator = new BigInteger("3");
        BigInteger denominator = new BigInteger("2");

        for (int i = 1; i < 1000; i++) {

            // This is all about pattern matching
            // numerator = numerator + 2 * denominator
            // denominator = numerator - denominator
            numerator = numerator.add(BigInteger.valueOf(2L).multiply(denominator));
            denominator = numerator.subtract(denominator);

            if (numerator.toString().length() > denominator.toString().length()) {
                count++;
            }

        }

        System.out.println(count);

    }
}
