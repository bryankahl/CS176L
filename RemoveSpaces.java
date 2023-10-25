import java.util.Scanner;

public class RemoveSpaces {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a phrase: ");
		String phrase = scan.nextLine();
		String str = "";
		for(int i = 0; i<phrase.length(); i++) {
			char c = phrase.charAt(i);
			if(!Character.isWhitespace(c)) {
				str += c;
			}
			
		}
		System.out.println(str);
		

	}

}