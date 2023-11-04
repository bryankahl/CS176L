import java.util.*;
import java.util.Scanner;
 
public class FirstRepeating {
    public static int firstRepeat(int[] arr, int o) {
        for (int i = 0; i < o; i++) {
            for (int i2 = i + 1; i2 < o; i2++) {
                if (arr[i] == arr[i2]) {
                    return i;
                }
            }
        }
        return -2;
    }
 
    
    public static void main(String[] args) {
    	int SIZE;
    	Scanner scan = new Scanner(System.in);
    	System.out.println("Enter the size of the array you want: ");
    	SIZE = scan.nextInt();
        int[] arr = new int[SIZE];
        for(int i = 0; i < SIZE; i++) {
        	System.out.println("Enter an integer: ");
        	int arrayInput = scan.nextInt();
        	arr[i] = arrayInput;
        }
        System.out.println("This is your array: ");
        System.out.println(Arrays.toString(arr));
        int length = arr.length;
        int index = firstRepeat(arr, length);
        if (index == -2) {
            System.out.println("The array does not have any repeats");
        }
        else {
            System.out.println("The element that repeated first is: " + arr[index]);
        }
    }
}