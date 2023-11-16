import java.util.Scanner;
import java.util.*;
 
public class RomanNumeralsQuestionTwo {
    
	public static int romanToDecimal(String roman) {
        int result = 0;
        for (int i = 0; i < roman.length(); i++) {
            int currentVal = getValue(roman.charAt(i));
            if (i + 1 < roman.length()) {
                int nextVal = getValue(roman.charAt(i + 1));
                if (currentVal < nextVal) {
                    result += (nextVal - currentVal);
                    i++; 
                } else {
                    result += currentVal;
                }
            } else {
                result += currentVal;
            }
        }

        return result;
    }

    private static int getValue(char romanChar) {
        switch (romanChar) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:  //same as if/else statement (throw new is the else or exception)
                throw new IllegalArgumentException("Invalid Roman numeral character: " + romanChar);
        }
    }

    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	System.out.println("Input: ");
    	String romanNumeral = scan.nextLine();
        int decimalValue = romanToDecimal(romanNumeral);
        System.out.println("Output: " + decimalValue);
        
        System.out.println("Input: ");
    	String romanNumeral2 = scan.nextLine();
        int decimalValue2 = romanToDecimal(romanNumeral2);
        System.out.println("Output: " + decimalValue2);
        
        System.out.println("Input: ");
    	String romanNumeral3 = scan.nextLine();
        int decimalValue3 = romanToDecimal(romanNumeral3);
        System.out.println("Output: " + decimalValue3);
    }
}