
public class EmployeeGeneric<t> {
	public String name;
	t age;
	public Employee(String name, t age) {
		this.name = name;
		this.age = age;
		
	}
	public String toString() {
		return "Name = " + name + ", Age = " + age;
	}
}
