import java.util.Scanner;
public class Problem3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = scan.next();
		if(s.charAt(0) == '0') {
	        System.out.println("zero"+s.substring(1));
		}else if(s.charAt(0) == '1') {
			System.out.println("one"+s.substring(1));
		}else if(s.charAt(0) == '2') {
			System.out.println("two"+s.substring(1));
		}else if(s.charAt(0) == '3') {
			System.out.println("three"+s.substring(1));
		}else if(s.charAt(0) == '4') {
			System.out.println("four"+s.substring(1));
		}else if(s.charAt(0) == '5') {
			System.out.println("five"+s.substring(1));
		}else if(s.charAt(0) == '6') {
			System.out.println("six"+s.substring(1));
		}else if(s.charAt(0) == '7') {
			System.out.println("seven"+s.substring(1));
		}else if(s.charAt(0) == '8') {
			System.out.println("eight"+s.substring(1));
		}else if(s.charAt(0) == '9') {
			System.out.println("nine"+s.substring(1));
		}else {
			System.out.println(s);
		}
	}

}
