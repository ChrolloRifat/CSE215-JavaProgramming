
public class MethodOverloading {

	public static void main(String[] args) {
		Students stud = new Students();
		String[] name = new String[]{ "Rifat", "Haythum", "Bruce", "Vladimir", "Maggie", "Sayori" };
		String [] id = new String[] {"2434","3425","2342","2355","6564","8698"};
		double[] cgpa = new double[] {3.99,3.13,3.99,3.64,3.72,3.93};
		double[] marks = new double[] {92,91,89,97,78,87};
		
		stud.studentsInfo(name, id, cgpa);
		stud.studentsInfo(name, marks);
		
	}

}

class Students{
	//constructor
	Students(){
		
	}
	//Overloaded methods
	public void studentsInfo(String[] name, String[] id, double[] cgpa) {
		//Students' names
		System.out.print("The students are: ");
		for(int i = 0; i < name.length; i++) {
			System.out.print(name[i]);
			if(i < name.length - 1) {
				System.out.print(", ");
			}
		}
		
		//Students' id
		System.out.println();
		System.out.print("Their respective student IDs: ");
		for(int i = 0; i < id.length; i++) {
			System.out.print(id[i]);
			if(i < id.length - 1) {
				System.out.print(", ");
			}
		}
		
		//Students' CGPA
		System.out.println();
		double sum = 0;
		System.out.print("Their respective CGPAs: ");
		for(int i = 0; i < cgpa.length; i++) {
			System.out.print(cgpa[i]);
			if(i < cgpa.length - 1) {
				System.out.print(", ");
			}
			sum += cgpa[i];
		}
		
		double avg = sum / cgpa.length;
		System.out.println();
		System.out.println("The sum of the CGPAs is: " + sum);
		System.out.printf("The average CGPA is: %.2f \n", avg);
		
		
		
			
	}
	
	public void studentsInfo(String[] name, double[] marks) {
		
		double top = marks[0];
		int nameIndex = 0;
		for(int i = 0; i < marks.length; i++) {
			if(marks[i] > top) {
				top = marks[i];
				nameIndex = i;
			}
		}
		System.out.println("The top scorer is: " + name[nameIndex] + ". Marks: " + top);
	}
	
	
}
