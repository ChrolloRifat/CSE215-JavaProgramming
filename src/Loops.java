
public class Loops {

	public static void main(String[] args) {
		loop1();
		System.out.println();
		loop2();
		System.out.println();
		loop3();
	}
	
	public static void loop1() {
		/*Print the following patterns using loop :
					*
					**
					***
					****
		 */
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	public static void loop2() {
		/*
		 		 *
		 		***
		 	   *****
		 		***
		 		 *
		 */
		final int ROWS = 3;
		int stars = 1;
		int spaces = ROWS -1;
		for (int i = 1; i < 2 * ROWS; i++) {
			
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k < 2 * stars; k++) {
                System.out.print("*");
            }
            System.out.println();
            if(i < ROWS) {
            	spaces --;
            	stars ++;
            	
            }
            else {
            	spaces++;
            	stars--;
            	
            }
        }
		
		
	}
	
	public static void loop3() {
		/*
		 	1010101
			 10101
			  101
			   1 
		 */
		
		final int Rows = 4;
		int num = (Rows * 2) - 1;
		int spaces = 0;
		for(int i = 1; i <= Rows; i++) {
			for(int j = 1; j <= spaces; j++) {
				System.out.print(" ");
			}
			for(int k = 1; k <= num ; k++) {
				if(k % 2 == 0) {
				System.out.print("0");
				}
				else {
					System.out.print("1");
				}
				
			}
			
			System.out.println();
			spaces++;
			num -= 2;
		}
	}
	
}
