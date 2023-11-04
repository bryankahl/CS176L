import java.util.Scanner;
import java.util.Arrays;

public class ReversingArray {
	  
	    public static void main(String[] args) {
	    	int SIZE = 3;
	        int[] arr = new int[SIZE];
	        Scanner scan = new Scanner(System.in);
	        for(int i = 0; i < SIZE; i++) {
	        	System.out.println("Enter an integer: ");
	        	int arrayInput = scan.nextInt();
	        	arr[i] = arrayInput;
	        }
	        System.out.println("This is your array: ");
	        System.out.println(Arrays.toString(arr));
	        StringBuilder reversed = new StringBuilder();
	        for (int i = arr.length; i > 0; i--) { 
	            reversed.append(arr[i - 1]).append(" ");
	        }
	        String[] reversedArray = reversed.toString().split(" "); 
	        System.out.println("This is your reversed array: ");
	        System.out.println(Arrays.toString(reversedArray));
	
	    } 
	} 
