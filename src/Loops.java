
public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		loop2();
	}
	
	public static void loop1() {
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	public static void loop2() {
		for (int i = 0; i < 3; i++) {
            for (int j = 2 - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= 2 * i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
		for (int i = 1; i > 0; i--) {
            for (int j = 0; j < 2 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 2 * i; k >= 0; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
		
	}
	

}
