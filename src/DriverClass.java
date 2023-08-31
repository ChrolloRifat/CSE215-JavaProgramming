
public class DriverClass {

	public static void main(String[] args) {
		System.out.println("Hello");
		
		Faculty fac = new Faculty("Sam","Male", 21, "2435345235", "ECE", 200_00, "SAM", "Professor");
		System.out.println(fac.getName());
		System.out.println(fac.getGender());
		System.out.println(fac.getAge());
		System.out.println(fac.getId());
		System.out.println(fac.getDepartment());
		System.out.println(fac.getSalary());
		System.out.println(fac.getInitial());
		System.out.println(fac.getRank());
		System.out.println(fac.toString());
		

	}

}
