
public class RoboGrid {
	public static final int MX = 100;
	public  static final int MY = 100;
	private int cur_x;
	private int cur_y;
	private String name;
	
	//constructors
	public RoboGrid() {
		this.name = "Nimo";
		this.setPos(0, 0);
	}
	public RoboGrid(String name, int x, int y) {
		this.name = name;
		this.setPos(x, y);
	}
	
	//class methods
	public boolean moveUp(int z) {
		if(cur_y + z <= MY) {
			cur_y = cur_y + z;
			return true;
		}
		else {
			cur_y = MY;
			return false;
		}
	}
	public boolean moveRight(int z) {
		if(cur_x + z <= MX) {
			cur_x = cur_x + z;
			return true;
		}
		else {
			cur_x = MX;
			return false;
		}
	}
	//overloaded method
	public boolean moveRight() {
		if(cur_x + 1 <= MX) {
			cur_x = cur_x + 1;
			return true;
		}
		else {
			return false;
		}
	}
	
	//setter method
	public boolean setPos(int x, int y) {
		if(x <= MX && y <= MY) {
			cur_x = x;
			cur_y = y;
			return true;
		}
		else {
			return false;
		}
	}
	
	//getter methods
	public int getPosX() {
		return cur_x;
	}
	public int getPosY() {
		return cur_y;
	}
	
	@Override
	public String toString() {
		return "The " + name + " is at (" + this.getPosX() + "," + this.getPosY() + ")";
	}
	
	//main method
	public static void main(String[] args) {
		RoboGrid r1 = new RoboGrid("Melissa", 15, 40);
		RoboGrid r2 = new RoboGrid("Bob", 44, 20);
		r1.moveRight(7);
		r2.moveUp(11);
		System.out.println(r1.toString());
		System.out.println(r2.toString());
	}
}
