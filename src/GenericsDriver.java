import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class GenericsDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Generics<String> obj = new Generics <String>("Hello!");
		Generics<Integer> obj2 = new Generics <Integer>(101);
		Generics<Double> obj3 = new Generics <Double>(1011.23);
		System.out.println(obj);
		System.out.println(obj2);
		System.out.println(obj3);
		
		Employee<Integer> emp1 = new Employee("Sam", 22);
		Employee<Double> emp2 = new Employee<Double>("Rift", 22.90);
		System.out.println(emp1);
		System.out.println(emp2);
		
		Generics<Employee> obj4 = new Generics<>(new Employee("Simen", 21));
		System.out.println(obj4);
		
		ArrayList obj5 = new ArrayList();
		obj5.add(52);
		obj5.add("Rifat");
		obj5.add(5.2);
		obj5.add(new Employee("Rahannum", 24));
		obj5.add("Hello");
		
		
		
		ArrayList<String> obj6 = new ArrayList<String>();
		obj6.add("Rifat");
		obj6.add("Simen");
		obj6.add("Vixen");
		obj6.add("Astek");
		System.out.println(obj6);
		Collections.sort(obj6);
		System.out.println(obj6);
	}

}
