import java.util.*;

public class FirstNonRepeating {
	
	static int noRepeat(int arr[], int o){
        for (int i = 0; i < o; i++) {
            int i2;
            for (i2 = 0; i2 < o; i2++)
                if (i != i2 && arr[i] == arr[i2])
                    break;
            if (i2 == o)
                return arr[i];
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
        int index = noRepeat(arr, length);
        if (index == -2) {
            System.out.println("The array repeats the entire time and there are no non repeats");
        }
        else {
            System.out.println("The element that stopped repeating first is: " + noRepeat(arr, length));

	}

}
}
