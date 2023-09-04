
public class PartTimeEmployee extends AnotherEmployee {

	private double hours;
	private double rate;
	
	 PartTimeEmployee() {
		
		this(0.00,0.00);
		
	}
	PartTimeEmployee(double hours, double rate) {
			this.hours = hours;
			this.rate = rate;
			
		}
	 PartTimeEmployee(String department, String designation, double hours, double rate) {
			super(department, designation);
			this.hours = hours;
			this.rate = rate;
			
		}
	 PartTimeEmployee(String name, int age, String address,String department, String designation, double hours, double rate) {
			super(name, age, address,department, designation);
			this.hours = hours;
			this.rate = rate;
			
		}
	 
	 public double getHours() {
		 return hours;
	 }
	 public double getRate() {
		 return rate;
	 }
	 public void setHours(double hours) {
		 this.hours = hours;
	 }
	 public void setRate(double rate) {
		 this.rate = rate;
	 }
	 
	 public double salary() {
		 return this.hours * this.rate;
	 }
	 public String toString() {
			return super.toString() + ", Hours: " + this.hours + ", Rate: " + this.rate;
		}
		
	
	 
}
