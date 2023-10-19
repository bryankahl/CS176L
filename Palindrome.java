import java.util.Scanner;

class Palindrome {
	private String str;
    
    public static boolean isPalindrome(String str)
    {
    	String reverse = "";
    	boolean answer = false;
    	for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }
    	if (str.equals(reverse)) {
            answer = true;
            System.out.println("It is a palindrome!");
        }else {
        	answer = false;
        	System.out.println("It is not a palindrome!");
        }
        return answer;
    }
    
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input word to see if it is a palindrome:");
        String str = scan.nextLine();
 
        
        str = str.toLowerCase();
        boolean A = isPalindrome(str);
        
    }
}