import java.util.Scanner;
public class Problem1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter name 1: ");
		String name1 = scan.nextLine();
		System.out.println("Enter name 2");
		String name2 = scan.nextLine();
		boolean name = name1.equals(name2);
		if(name1.equals(name2)) {
			System.out.println("Same name "+name);
		}else {
			System.out.println("name1 and name2 are different");
		}

	}

}
