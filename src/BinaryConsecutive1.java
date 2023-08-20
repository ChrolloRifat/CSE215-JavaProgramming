import java.io.IOException;
import java.util.Scanner;

 /* Print a single base-10 integer that denotes the maximum
  * number of consecutive 1's in the binary representation of n.
  */
public class BinaryConsecutive1 {
    public static void main(String[] args) throws IOException {
    	Scanner scan = new Scanner(System.in);
    	System.out.println("Enter a decimal number:");
        int n = scan.nextInt();
        int number = n;
        
		String remainderString = "";
        while(n > 0){
        int remainder = n % 2; 
        n = n / 2;
        remainderString = remainderString + remainder;
		
        }
        String reversedString = "";
		for(int i = remainderString.length() - 1; i >= 0; i--){
			reversedString = reversedString + remainderString.charAt(i);
		}
		
		int mostConsecutive = 0;
		String[] stringArray = reversedString.split("0"); //splitting wherever there is a 0.So we end up with strings of 1
		for(int i = 0; i < stringArray.length; i++) {
			int consecutiveInOneStr = 0;
			for(int j = 0; j < stringArray[i].length(); j++) {  //this loop counts the number of 1 in one single string
				if(stringArray[i].charAt(j) == '1') {
					consecutiveInOneStr++;
				}
			} 
			if(mostConsecutive < consecutiveInOneStr) {
				mostConsecutive = consecutiveInOneStr;
			}
		}
        System.out.println("The number " + number + " in binary is " + reversedString);
        System.out.println("The maximum number of consecutive 1's is " + mostConsecutive);

        scan.close();
    }
}