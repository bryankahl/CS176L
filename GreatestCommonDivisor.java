import java.util.Scanner;

class GreatestCommonDivisor{ 
    
    static int gcd(int a, int b) { 
      if (b == 0) 
        return a; 
      return gcd(b, a % b);  
    } 
      
    
    public static void main(String[] args)  { 
    	Scanner scan = new Scanner(System.in);
    	System.out.println("Input value 1: ");
    	int A = scan.nextInt();
    	while(A < 0 || A > 1000) {
        	System.out.println("Input is not valid! Please input again: ");
        	A = scan.nextInt();
    	}{
    		System.out.println("Input value 2: ");
    		int B = scan.nextInt();
    		while(B < 0 || B > 1000) {
    			System.out.println("Input is not valid! Please input again:");
    			B = scan.nextInt();
    		}{
    			System.out.println("The GCD is: " + gcd(A, B));
    		}
    	}
    	
        
    } 
}