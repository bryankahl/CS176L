import java.util.Scanner;

public class ReverseProblem {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a phrase: ");
	    String phrase = scan.nextLine();
	    StringBuilder input = new StringBuilder();
	    input.append(phrase);
	    input.reverse();
	    System.out.println(input);
	    
	}
}


