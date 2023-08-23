class Area {
	//instance variables
	private int length, breadth;
	//no-arg constructor
	public Area ()
	{
		
	}
	//arg constructor
	public Area (int length, int breadth)
	{
		this.length = length;
		this.breadth = breadth;
	}
	//getter-setter method
	public int getLength()
	{
		return length;
	}
	public void setLength(int length)
	{
		this.length = length;
	}
	public int getBreadth()
	{
		return breadth;
	}
	public void setBreadth(int breadth)
	{
		this.breadth = breadth;
	}
	//concrete method
	public int area()
	{
		return length*breadth;
	}
	@override
	public String toString()
	{
		return "The length is: " + 
	this.getLength() + " And the breadth is: " + this.getBreadth() + 
	" And the Area is: "+this.area();
	}
}
public class Driver {
	public static void main(String[] args) {
		Area obj1 = new Area ();
		obj1.setLength(2);
		obj1.setBreadth(6);
		Area obj2 = new Area (5, 6);
		System.out.println(obj1); //calling toString method for obj1
		System.out.println(obj2); //calling toString method for obj2
	}
	}


