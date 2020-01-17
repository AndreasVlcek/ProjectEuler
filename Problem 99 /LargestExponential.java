import java.io.*;

public class LargestExponential {

    public static void main(String[] args) throws IOException {

        double maxNum = 0.0;
        int lineFound = 0;

        File file = new File(args[0]);
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        StringBuffer stringBuffer = new StringBuffer();
        String line;

        int lineNum = 1;

        while ((line = bufferedReader.readLine()) != null) {

            String[] parts = line.split(",");

            // https://www.mathblog.dk/project-euler-99-which-baseexponent-pair-in-the-file-has-the-greatest-numerical-value/
            double base = Math.log(Double.parseDouble(parts[0]));
            double exponent = Double.parseDouble(parts[1]);
            double calc = base * exponent;

            if (calc > maxNum) {
                maxNum = calc;
                lineFound = lineNum;
            }

            lineNum++;

        }
        fileReader.close();

        System.out.println(lineFound);

    }

}
