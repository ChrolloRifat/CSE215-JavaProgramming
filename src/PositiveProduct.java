import java.util.*;
/*
 * Write a java program which will take integer inputs
 * from user until he/she presses any negative number.
 *  Print the product of all the positive numbers
 */
public class PositiveProduct {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = 0;
		int result = 1;
		System.out.println("Enter the positive numbers:");
		do {
			num = scan.nextInt();
			result = result * num;
			if(num < 0) {
				result = result / num;
			}
		}while(num >= 0);
		System.out.println("The product is: " + result);
		scan.close();

	}

}
