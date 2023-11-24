import java.util.*;
class Generics<T>{
	T var;
	Generics(T i){
		var = i;
	}
	T getVal(){
		return var;
	}
	public String toString()
	{
		return " " +var;
	}
}
class GenericsSort<T extends Comparable<T>>{
	T data[];
	GenericsSort(T val[]){
		data = val;
	}
	void sort(){
		int i,j,n;
		T temp;
		n = data.length;
		
		for(i=0;i<n-1;i++)
			for(j=i+1;j<n;j++)
			{
				if(data[i].compareTo(data[j])>0)
				{
					temp = data[i];
					data[i] = data[j];
					data[j] = temp;
				}
			}
		
		for(i=0;i<data.length;i++)
			System.out.print(data[i]+"  ");
		System.out.println();
	}
}
class Person implements Comparable<Person> {
	String name;
	int age;
	Person(){}
	Person(String s,int i){
		name = s;
		age = i;
	}
	public String toString() {
		return name+" "+age;
	}
	@Override
	public int compareTo(Person o) {
		if(age>o.age) return 1;
		else if(age<o.age) return -1;
		else return 0;
	}
}
public class Test {
	public static void main(String[] args) {
		Generics <Integer> obj = new Generics <Integer>(2);
		System.out.println(obj);
		ArrayList <Integer> Aobj = new ArrayList<>();
		Aobj.add(5);
		Aobj.add(10);
		Aobj.add(2);
		Aobj.remove(0);
		Aobj.set(0, 11);
		System.out.println(Aobj);
		Collections.sort(Aobj);
		System.out.println(Aobj);
		Generics<Person> Pobj = new Generics<> (new Person("XYZ",100));
		System.out.println(Pobj);
		Person p[] = {new Person("Asif",30),new Person("Faisal",10),new Person("Monir",20)};
		GenericsSort<Person> objP = new GenericsSort<>(p);
		objP.sort();
		
		
	}
}
