
public class HouseTest {

	public static void main(String[] args) {
		House house1 = new Apartment();
		House house2 = new Villa();
		System.out.println(house1.forSale());
		house1.location();
		System.out.println(house2.forSale());
		house2.location();
	
	}

}
