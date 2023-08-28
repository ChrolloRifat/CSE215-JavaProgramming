
public class PointLineDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point point1 = new Point(0,0);
		Point point2 = new Point(4, 5);
		
		Line line1 = new Line(1,1,3,4);
		Line line2 = new Line(point1, point2);
		
		System.out.println(point1.distance(point2));
		System.out.println(line1.length());
		System.out.println(line2.length());
		

	}

}
