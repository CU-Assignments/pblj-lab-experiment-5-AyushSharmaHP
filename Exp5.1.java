import java.util.*;

public class IntegerSumCalculator {
    
    // Method to parse string into Integer
    public static Integer parseStringToInteger(String str) {
        try {
            return Integer.parseInt(str); // Parse the string to an integer
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format: " + str);
            return null; // Return null if parsing fails
        }
    }
    
    // Method to calculate sum of integers in a list
    public static int calculateSum(List<Integer> numbers) {
        int sum = 0;
        for (Integer num : numbers) {
            if (num != null) { // Avoid null values
                sum += num; // Unboxing happens automatically here
            }
        }
        return sum;
    }
    
    public static void main(String[] args) {
        List<String> inputValues = Arrays.asList("10", "20", "30", "40", "50"); // Test case 1
        List<Integer> integerList = new ArrayList<>();
        
        // Convert input strings to integers
        for (String value : inputValues) {
            Integer parsedValue = parseStringToInteger(value);
            if (parsedValue != null) {
                integerList.add(parsedValue); // Autoboxing occurs here
            }
        }
        
        // Calculate and print the sum
        int sum = calculateSum(integerList);
        System.out.println("The sum of the list is: " + sum);
    }
}
