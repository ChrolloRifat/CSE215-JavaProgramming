
public class FullTimeEmployee extends AnotherEmployee {

	private double basic;
	private double allowance;
	
	 FullTimeEmployee() {
		
		this(0.00,0.00);
		
	}
	FullTimeEmployee(double basic, double allowance) {
			this.basic = basic;
			this.allowance = allowance;
			
		}
	 FullTimeEmployee(String department, String designation, double basic, double allowance) {
			super(department, designation);
			this.basic = basic;
			this.allowance = allowance;
			
		}
	 FullTimeEmployee(String name, int age, String address,String department, String designation, double basic, double allowance) {
			super(name, age, address,department, designation);
			this.basic = basic;
			this.allowance = allowance;
			
		}
	 public double getBasic() {
		 return basic;
	 }
	 public double getAllowance() {
		 return allowance;
	 }
	 public void setBasic(double basic) {
		 this.basic = basic;
	 }
	 public void setAllowance(double allowance) {
		 this.allowance = allowance;
	 }
	 
	 public double salary() {
		 return this.basic + (this.allowance / 100) * this.basic;
	 }
	 public String toString() {
			return super.toString() + ", Basic Salary: " + this.basic + ", Allowance: " + this.allowance + "%";
		}
		
	
	 
}
