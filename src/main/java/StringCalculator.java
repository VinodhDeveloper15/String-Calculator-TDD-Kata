import java.util.ArrayList;
import java.util.List;

public class StringCalculator {
    public int add(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }
        String delimiter = ",|\n";
        if (numbers.startsWith("//")) {
            int delimiterIndex = numbers.indexOf("\n");
            delimiter = numbers.substring(2, delimiterIndex);
            numbers = numbers.substring(delimiterIndex + 1);
        }
        String[] numArray = numbers.split(delimiter);
        int sum = 0;
        List<String> negatives = new ArrayList<>();
        for (String num : numArray) {
            int value = Integer.parseInt(num);
            if (value < 0) {
                negatives.add(num);
            }
            sum += value;
        }
        if (!negatives.isEmpty()) {
            throw new IllegalArgumentException("Negative numbers not allowed: " + String.join(", ", negatives));
        }
        return sum;
    }
}
