import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String:");
		String str = scan.nextLine();
		boolean check =  isPalindrome(str); // calling the isPalindrome method
		if(check == true) {
			System.out.println("The input string is a Palindrome");
		}
		else {
			System.out.println("The input string is NOT a Palindrome");
		}
	}
	// the method to check if the string is Palindrome
	public static boolean isPalindrome(String str) {
		
		String lowStr = str.toLowerCase();
		boolean truth = false;
		for(int i = 0; i < lowStr.length()/2; i++) {
			
			truth = lowStr.charAt(i) != lowStr.charAt(lowStr.length()-1-i) ? false  : lowStr.charAt(i) == lowStr.charAt(lowStr.length()-1-i) ? true : false;
			
			//alternative way using if-else block
//			if(lowStr.charAt(i) != lowStr.charAt(lowStr.length()-1-i)) {
//				break;
//			}
//			else if(lowStr.charAt(i) == lowStr.charAt(lowStr.length()-1-i)) {
//				truth = true;
//			}
		}
		
		return truth;
	}
}
