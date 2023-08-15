import java.util.Scanner;

public class NumberPresenceInArray {
/*	Take 10 integer inputs from user and store them in an array.
	*Again ask user to give a number. Now, tell user whether that number is present
	*in array or not.
	*/
	public static void main(String[] args) {
		final int NUM = 10;
		Scanner scan = new Scanner(System.in);
		int[] array = new int[NUM];
		System.out.println("Enter the Numbers to Store in the Array:");
		for(int i = 0; i < array.length; i ++) {
			array[i] = scan.nextInt();
		}
		System.out.println("Enter a number to check if it is present:");
		boolean isPresent = false;
		int input = scan.nextInt();
		scan.close();
		for(int i = 0; i < array.length; i++) {
			if(array[i] == input) {
				isPresent = true;
				break;
			}
			else {
				isPresent = false;
			}
		}
		
		if(isPresent == true) {
		System.out.println("The input number is present in the array");
		}
		else {
			System.out.println("The input number is NOT present in the array");
		}

	}

}
