import java.util.Scanner;

public class RemoveSpecificCharacter {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a phrase: ");
		String myStr = scan.nextLine();
		System.out.println("Enter character you want to remove: ");
		String oldCharacter = scan.nextLine();
		String removeCharacter = "";
		System.out.println(myStr.replace(oldCharacter, removeCharacter));

	}

}
