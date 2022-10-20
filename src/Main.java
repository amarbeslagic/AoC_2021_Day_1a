import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        File file = new File("inputs//input_AoC_1a.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));


        int countNumberOfIncrease = 0;
        int lastNumber = -1;

        String s;
        while((s = br.readLine()) != null) {
            if(s.isBlank()) continue;

            int current = Integer.parseInt(s);

            if(current > lastNumber && lastNumber != -1) {
                countNumberOfIncrease++;
                lastNumber = current;
            }
            else {
                lastNumber = current;
            }
        }

        System.out.println(countNumberOfIncrease);
    }
}