public class EvenOddInArray {
	/*  Instantiate an array as follows: {13, 3, 2, 59, 91, 11, 28};
	 *  Iterate through the array and check if each index is odd or even.
	 *	For each iteration print the following:
	 *  "The value {val} at index {i} is odd/even".
	 */
	public static void main(String[] args) {
		
		int[] array = new int[]{13, 3, 2, 59, 91, 11, 28};
		for(int i = 0; i < array.length; i++) {
			if(array[i] % 2 == 0) {
				System.out.println("The value " + array[i] + " at index " + i + " is EVEN");
			}
			else {
				System.out.println("The value " + array[i] + " at index " + i + " is ODD");
			}
		}
		

	}

}
