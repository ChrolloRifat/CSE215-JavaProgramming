import java.util.Scanner;

public class Grades {
	/* Write a program which will ask the user to enter his/her
	 * marks (out of 100).
	 * Define a method named Grader that will display grades
	 * according to the marks entered as below:
	 * Marks			Grade
 		91-100			A
		81-90			B+
 		71-80			B
		61-70			C
 		51-60			D+
		40-50			D
 		<40				Fail
	 */
	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		System.out.println("Enter your marks:");
		double marks = scan.nextDouble();
		scan.close();
		System.out.println("Your grade is: " + grader(marks));
	}

	public static String grader(double num) {
		String grade = "";
		if(num >= 91) {
			grade = "A";
		}
		else if(num >= 81) {
			grade = "B+";
		}
		else if(num >= 71) {
			grade = "B";
		}
		else if(num >= 61) {
			grade = "C";
		}
		else if(num >= 51) {
			grade = "D+";
		}
		else if(num >= 40) {
			grade = "D";
		}
		else {
			grade = "Fail";
		}
		return grade;
	}
}
