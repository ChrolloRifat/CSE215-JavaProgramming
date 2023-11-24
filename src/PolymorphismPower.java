class Book{
	private String name;
	private double price;
	public Book(String name,double price) {
		this.name = name;
		this.price = price;
	}
	
	
	public double calculatePrice() {
		return price;
	}
	
	 public String toString() {
		 return "Book name: " + this.name + "," + "Book Price: " + this.calculatePrice();
	 }
}
class StoryBook extends Book{
	private double discount;
	 public StoryBook(String name, double price, double discount) {
		 super(name, price);
		 this.discount = discount;
	 }
	 public double calculatePrice() {
			double discountedPrice = 1 - discount;
			return super.calculatePrice() * discountedPrice;
		}
	 public String toString() {
		 return super.toString() + ","  + "Discounted Price: " +  this.calculatePrice();
	 }
}
class ChildStoryBook extends StoryBook{
	 
	 public ChildStoryBook(String name, double price, double discount) {
		 super(name, price, discount);
		
	 }
	 public double calculatePrice() {
			return super.calculatePrice() - 10;
		}
	 public String toString() {
		 return super.toString() + "," + "Extra Discounted Price: " +  this.calculatePrice();
	 }
}
public class PolymorphismPower {

	public static void main(String[] args) {
		Book book = new Book ("s", 100);
		double temp = book.calculatePrice();
		System.out.println(book.toString());
		book = new StoryBook("b", 2350,0.2);
		temp += book.calculatePrice();
		System.out.println(book.toString());
		System.out.println(book.toString());
		book = new ChildStoryBook("c", 200, 0.2);
		temp += book.calculatePrice();
		System.out.println(book.toString());
		double total = temp;
		System.out.println("Total Bill: " + total);

	}

}
