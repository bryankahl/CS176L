import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PositiveChecker {
    public static void main(String[] args) {
        try {
        	FileReader fileReader = new FileReader("ListOfNumbers.txt");
            String filePath = "ListOfNUmbers.txt";
            BufferedReader reader = new BufferedReader(fileReader);
            String line;           
            while ((line = reader.readLine()) != null) {
                int number = Integer.parseInt(line);
                if (number > 0) {
                    throw new PositiveNumberException("Positive number found: " + number);
                }
            }
            reader.close();          
            System.out.println("All numbers are non-positive.");
        } catch (IOException | NumberFormatException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        } catch (PositiveNumberException e) {
            System.err.println(e.getMessage());
        }
    }
}

class PositiveNumberException extends Exception {
    public PositiveNumberException(String message) {
        super(message);
    }
}