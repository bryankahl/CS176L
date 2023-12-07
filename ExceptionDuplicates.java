import java.util.ArrayList;
import java.util.Scanner;

public class ExceptionDuplicates {
    public static void main(String[] args) {
        try {
            
            ArrayList<Integer> numbers = new ArrayList<>();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a list of integers (enter anything else to exit):");
            while (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                if (containsDuplicate(numbers, number)) {
                    throw new DuplicateNumberException("Duplicate number found: " + number);
                }
                numbers.add(number);
            }
            scanner.close();
            System.out.println("No duplicate numbers found.");
        } catch (DuplicateNumberException e) {
            System.err.println(e.getMessage());
        }
    }
    private static boolean containsDuplicate(ArrayList<Integer> numbers, int number) {
        for (int n : numbers) {
            if (n == number) {
                return true;
            }
        }
        return false;
    }
}

class DuplicateNumberException extends Exception {
    public DuplicateNumberException(String message) {
        super(message);
    }
}