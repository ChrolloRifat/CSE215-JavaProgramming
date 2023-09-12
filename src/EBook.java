
public class EBook extends Book {
	private String downloadUrl;
	private double sizeMB;
	
	EBook(){
		super();
	}
	EBook(String isbn, String title, String author, double price, String downloadUrl, double sizeMB){
		super(isbn, title, author, price);
		this.downloadUrl = downloadUrl;
		this.sizeMB = sizeMB;
	}
	EBook(String isbn, String title, String author, String downloadUrl, double sizeMB){
		super(isbn, title, author);
		this.downloadUrl = downloadUrl;
		this.sizeMB = sizeMB;
	}
	EBook(String title, String author, String downloadUrl, double sizeMB){
		
		super(title, author);
		this.downloadUrl = downloadUrl;
		this.sizeMB = sizeMB;
	}
	
	public String getDownloadUrl() {
		return downloadUrl;
	}
	public double getSizeMB() {
		return sizeMB;
	}
	public void setDownloadUrl(String downloadUrl) {
		this.downloadUrl = downloadUrl;
	}
	public void setSizeMB(double sizeMB) {
		this.sizeMB = sizeMB;
	}
	
	public String toString() {
		return super.toString() + "\nDownload url: " + this.downloadUrl + "\nSize: " + this.sizeMB + " MB";
	}
}
