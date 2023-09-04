

public class AnotherPerson {
	private String name;
	private int age;
	private String address;
	
	 AnotherPerson() {
		
	}
	
	 AnotherPerson (String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	public String getName() {
		return name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setname(String name) {
		this.name = name;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String toString() {
		return "Name: " + name + " Age: " + age + "Address: " + address;
	}

}
