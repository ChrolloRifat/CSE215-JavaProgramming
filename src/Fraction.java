public class Fraction {
	// Encapsulated variables
	private int numerator;
	private int denominator;
	
	// Default / no-argument constructor
	public Fraction() {
		
	}
	
	// Two arguments constructor
	public Fraction(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}
	
	// getter methods
	public int getNumerator() {
		return numerator;
	}
	public int getDenominator() {
		return denominator;
	}
	
	// setter methods
	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}
	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}
	
	//void methods 
	public void add(Fraction fraction) {
		System.out.println(""  + numerator + " / " + denominator + " + " + fraction );
	}
	public void sub(Fraction fraction) {
		System.out.println("" + numerator + " / " + denominator + " - " + fraction );
	}
	public void multiplication(Fraction fraction) {
		System.out.println("" + numerator + " / " + denominator + " x " + fraction );
	}
	public void division(Fraction fraction) {
		System.out.println("(" + numerator + " / " + denominator + ") / (" + fraction + ")" );
	}
	
	// toString method to print the output just the way I want it
	public String toString() {
		return "" + this.getNumerator() + " / " + this.getDenominator();
	}
}

