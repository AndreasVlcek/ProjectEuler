import java.math.BigInteger;

public class LargeNonMersennePrime {

    public static void main(String[] args) {
        BigInteger nonMersennePrime = new BigInteger("28433").multiply(new BigInteger("2").pow(7830457)).add(BigInteger.ONE);
        String nonMersennePrimeAsString = nonMersennePrime.toString();
        System.out.println(nonMersennePrimeAsString.substring(nonMersennePrimeAsString.length() - 10, nonMersennePrimeAsString.length()));
    }
}
