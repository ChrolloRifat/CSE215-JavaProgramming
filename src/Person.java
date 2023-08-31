
public class Person {
	private String name;
	private String gender;
	private int age;
	
	Person(){
		this("No name", "No gender given", 20 );
	}
	Person(String name, String gender, int age){
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	// getter methods
	public String getName() {
		return name;
	}
	public String getGender() {
		return gender;
	}
	public int getAge() {
		return age;
	}
	
	//setter methods
	public void setName(String name) {
		this.name = name;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String toString() {
		return "Name: " + name + ", Gender: " + gender + ", Age: " + age;
	}
	
}
