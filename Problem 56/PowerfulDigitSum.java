import java.math.BigInteger;


public class PowerfulDigitSum {

    public static void main(String[] args) {

        long max = 0;

        for (int i = 1; i < 100; i++) {
            for (int j = 1; j < 100; j++) {

                BigInteger num = new BigInteger(String.valueOf(i)).pow(j);

                String numAsString = num.toString();

                char[] stringArray = numAsString.toCharArray();

                long sum = 0;
                for (int k = 0; k < stringArray.length; k++) {
                    sum = sum + stringArray[k] - '0'; // To get the value of any character digit, just remove '0' (48)
                }

                if (sum > max) {
                    max = sum;
                }

            }
        }

        System.out.println(max);
    }
}
