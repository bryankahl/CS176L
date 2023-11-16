import java.util.Scanner;
public class RomanNumerals {

    public static String integerToRomanNumeral(int number) {
        String[] romanNumerals = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] numbers = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        StringBuilder romanNumeral = new StringBuilder();
        for (int i = 0; i < numbers.length; i++) {
            while (number >= numbers[i]) {
                romanNumeral.append(romanNumerals[i]);
                number -= numbers[i];
            }
        }
        return romanNumeral.toString();
    }

    
    
    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	System.out.println("Input 1: ");
    	int one = scan.nextInt();
        System.out.println(integerToRomanNumeral(one)); 
        System.out.println("Input 2: ");
    	int two = scan.nextInt();
        System.out.println(integerToRomanNumeral(two));    
        System.out.println("Input 3: ");
    	int three = scan.nextInt();
        System.out.println(integerToRomanNumeral(three));  
    }
}
