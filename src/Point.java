
public class Point {
	private int x;
	private int y;
	
	Point(){
		x = 0;
		y = 0;
		
	}
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	public String toString() {
		
		return "(" + getX() + "," + getY() + ")";
	}
	public double distance(Point point) {
		int valX = point.getX();
		int valY = point.getY();
		double sqrSum = Math.pow(( valX - x), 2) +  Math.pow((valY - y), 2) ;
		double distance = Math.sqrt(sqrSum);
		return distance;
	}

}
