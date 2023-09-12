
public class Book {
	private String isbn;
	private String title;
	private String author;
	private double price;
	
	Book(){
		
	}
	Book(String isbn, String title, String author, double price){
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.price = price;
	}
	Book(String isbn, String title, String author){
		this.isbn = isbn;
		this.title = title;
		this.author = author;
	}
	Book(String title, String author){
		
		this.title = title;
		this.author = author;
	}
	
	public String getISBN() {
		return isbn;
	}
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public String getPrice() {
		return price + "$";
	}
	
	public void setISBN(String isbn) {
		this.isbn = isbn;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public String toString() {
		return "ISBN: " + isbn + "\nTitle: " + title + "\nAuthor: " + author + "\nPrice: " + price;
	}
}
