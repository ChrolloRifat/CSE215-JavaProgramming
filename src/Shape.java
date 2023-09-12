

public class Shape {
	private String name;
	
	Shape(){
		this("No name");
	}

	public Shape(String name) {
		
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String toString() {
		return "Name: " + name;
	}
	
}

