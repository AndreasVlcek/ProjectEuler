public class SquareDigitChains {

    public static void main(String[] args) {

        int count = 1;  // 89 itself

        for (int i = 1; i < 10000000; i++) {

            int sum = i;

            while (sum != 1 && sum != 89) {

                int temp = 0;

                char[] stringAsCharArray = String.valueOf(sum).toCharArray();

                for (int j = 0; j < stringAsCharArray.length; j++) {
                    int square = Integer.parseInt(String.valueOf(stringAsCharArray[j])) * Integer.parseInt(String.valueOf(stringAsCharArray[j]));
                    temp = temp + square;
                }

                sum = temp;

                if (sum == 89) {
                    count += 1;
                }
            }
        }

        System.out.println(count);
    }
}