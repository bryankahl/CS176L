import java.util.Scanner;

public class Problem2 {
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		int n = scan.nextInt();
		System.out.println("Enter an operator: ");
		String op = scan.next();
		System.out.println("Enter an integer: ");
		int m = scan.nextInt();
		
		int sum = n + m;
		int difference = n-m;
		int multiple = n*m;
		int quotient = n/m;
		
		if(op.equals("+")) {
			System.out.println(sum);
		}else if(op.equals("-")){
			System.out.println(difference);
		}else if(op.equals("*")) {
			System.out.println(multiple);
		}else if(op.equals("/")) {
			System.out.println(quotient);
		}else {
			System.out.println("Please input a valid operator");
		}
	

	}
}