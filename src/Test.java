/*//File Create: 
import java.io.*; 
  public class Test {  
  public static void main(String[] args) {  
    try {  
      File myObj = new File("MyFile.txt");  
      if (myObj.createNewFile()) {  
        System.out.println("File created: " + myObj.getName());   
      } else {  
        System.out.println("File already exists.");  
      }  
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();  
    } 
    } 
}

//File Write
import java.io.*;
public class Test {
	public static void main(String[] args) {
		try {
		      FileWriter myWriter = new FileWriter("Input.txt");
		      myWriter.write("Hello!");
		      
		      myWriter.close();
		      System.out.println("Successfully wrote to the file.");
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
	}
}

//File Read
import java.io.*; 
import java.util.Scanner; // Import the Scanner class to read text files
public class Test {
	public static void main(String[] args) {
		try {
		      File myObj = new File("Input.txt");
		      Scanner myReader = new Scanner(myObj);
		      while (myReader.hasNextLine()) {
		        String data = myReader.nextLine();
		        System.out.println(data);
		      }
		      myReader.close();
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
	}
}

//File delete:
import java.io.*;
public class Delete {
	 public static void main(String[] args) { 
	 File myObj = new File("input.txt"); 
	    if (myObj.delete()) { 
	      System.out.println("Deleted the file: " + myObj.getName());
	    } else {
	      System.out.println("Failed to delete the file.");
	    }
	 }
}

//binary file read and write
import java.io.*;
public class Test {
	public static void main(String[] args) {
		String myFile = "File.bin";
		try {
			FileOutputStream fos = new FileOutputStream(myFile);
			ObjectOutputStream os = new ObjectOutputStream (fos);
			os.writeInt(567);
			os.writeDouble(78.987);
			os.writeUTF("My name is ....");
			os.close();
		}
		catch(IOException e) {
			System.out.println("Error");
		}
		System.out.println("Done writing.. Now Reading");
		try {
			FileInputStream fis = new FileInputStream(myFile);
			ObjectInputStream is = new ObjectInputStream (fis);
			int x = is.readInt();
			System.out.println(x);
			double d = is.readDouble();
			System.out.println(d);
			String s = is.readUTF();
			System.out.println(s);
			is.close();			
		}
		catch(IOException e) {
			System.out.println("Error");
		}
	}
}
*/
//Serializable class
import java.io.*;
class Person implements Serializable{
	public String name;
	public int age;
	Person(){}
	Person(String s, int i){
		name = s;
		age = i;
	}
	public String toString() {
		return "Name = "+name+","+ "Age = "+age;
	}
}
public class Test{
	public static void main(String[] args) {
		Person p = new Person();
		p.name = "XYZ";
		p.age = 100;
		Person parr[] = {new Person("Laila Begum", 12), new Person("Saila Begum", 32)};
		String myFile2 = "data.bin";
		try {
		ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(myFile2));
		os.writeObject(p); //write object
		os.writeObject(parr);
		os.close();
	}
		catch(IOException e) {
			System.out.println("Error");
		}
		System.out.println("Done writting");
		try {
			ObjectInputStream is = new ObjectInputStream(new FileInputStream(myFile2));
			Person pCopy = (Person) is.readObject();
			System.out.println("Name = "+pCopy.name + " "+", Age = "+pCopy.age);
			Person ParrCopy[] = (Person[]) is.readObject();
			for(int i=0; i<ParrCopy.length; i++)
				System.out.println(ParrCopy[i]);
			is.close();	
		}
		catch(IOException | ClassNotFoundException e) {
			System.out.println("Error");
		}
}
}


