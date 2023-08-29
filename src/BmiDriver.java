//Creating a class that will measure BMI
public class BmiDriver {

	public static void main(String[] args) {
		BMI b1 = new BMI("Rifat",22 , 57, 1.57);
		System.out.println(b1.getName());
		System.out.println(b1.getAge());
		System.out.println(b1.getWeight());
		System.out.println(b1.getHeight());
		System.out.println(b1.getBMI() + " ---> " + b1.getStatus());

	}
	

}
class BMI{
	private String name;
	private int age;
	private double weight;
	private double height;
	
	BMI(String name, int age, double weight, double height){
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.height = height;
	}
	BMI(String name, double weight, double height){
		this(name, 20, weight, height);
	}
	//Getter methods
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public double getWeight() {
		return weight;
	}
	public double getHeight() {
		return height;
	}
	//Setter methods
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getBMI() {
		return weight / (height * height);
	}
	public String getStatus() {
		if(getBMI() < 19) {
			return "Underweight";
		}
		else if(getBMI() < 25) {
			return "Normal weight";
		}
		else {
			return "Overweight";
		}
	}
}
