
public class AnotherEmployee extends AnotherPerson {
	
	
	private String department;
	private String designation;
	
	
	AnotherEmployee(){
		
		this( "Dept. not given", "Unknown designation");
		
	}
	AnotherEmployee(String department, String designation){
		
		
		this.department = department;
		this.designation = designation;
	}
	AnotherEmployee(String name,  int age, String address, String department, String designation){
		super(name,age,address);
		
		this.department = department;
		this.designation = designation;
	}
	//getters 
	
	public String getDepartment() {
		return department;
	}
	public String getDesignation() {
		return designation;
	}
	
	//setters

	public void setDepartment(String department) {
		this.department = department;
	}
	public void setSalary(String designation) {
		this.designation = designation;
	}
	
	public String toString() {
		return super.toString() + " Department: " + department + " Designation: " + designation;
	}
	
	
}
