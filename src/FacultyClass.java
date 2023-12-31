public class FacultyClass{
	public static void main(String[] args) {
		
		
		Faculty fac = new Faculty("Sam","Male", 21, "2435345235", "ECE", 200_00, "SAM", "Professor");
		System.out.println(fac.getName());
//		System.out.println(fac.getGender());
		System.out.println(fac.getAge());
//		System.out.println(fac.getId());
//		System.out.println(fac.getDepartment());
		System.out.println(fac.getSalary());
		System.out.println(fac.getInitial());
//		System.out.println(fac.getRank());
		
		//Displaying all information using the toString
		System.out.println(fac.toString()); 
		//System.out.println(fac); // gives the same result as the toString
		
		//Using the PartTime and FullTime Employee objects
		PartTimeEmployee part = new PartTimeEmployee(40, 23);
		FullTimeEmployee full = new FullTimeEmployee(15000, 25);
		
		System.out.println(part + " Salary: " + part.salary());
		System.out.println(full + " Salary: " + full.salary());		
}
}

class Faculty extends Employee {
private String initial;
private String rank;
	
	Faculty(){
		this("No initial given", "Unknown rank");
	}
	
	Faculty(String initial, String rank){
		this.initial = initial;
		this.rank = rank;
	}
	Faculty(String id, String department, double salary, String initial, String rank){
		super(id,department,salary);
		this.initial = initial;
		this.rank = rank;
	}
	Faculty(String name, String gender, int age, String id, String department, double salary, String initial, String rank){
		super(name, gender, age, id,department,salary);
		this.initial = initial;
		this.rank = rank;
	}
	
	
	//getters
	public String getInitial() {
		return initial;
	}
	public String getRank() {
		return rank;
	}
	
	//setters
	public void setInitial(String initial) {
		this.initial = initial;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}

	public String toString() {
		return super.toString() + ", Initial: " + initial + ", Rank: " + rank;
	}
}
