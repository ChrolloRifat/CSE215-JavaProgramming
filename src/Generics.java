
public class Generics <t> {
	
	public t data;
	public Generics(t d) {
		data = d;
	}
	public String toString() {
		return "" + data;
	}
}
