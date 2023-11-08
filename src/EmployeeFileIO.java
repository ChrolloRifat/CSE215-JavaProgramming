/*Create an Employee class with name and id.
 * Write 3 Employee objects to a file using serialization.
 * Then using deserialization, read the Employee objects back from the file
 * and print the name and id for each object.
 */
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

 class EmployeeFileIO implements Serializable {
	    private String name;
	    private long id;

	    public EmployeeFileIO(String name, long id) {
	        this.name = name;
	        this.id = id;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public long getId() {
	        return id;
	    }

	    public void setId(long id) {
	        this.id = id;
	    }
	    public static void main(String[] args) throws IOException, ClassNotFoundException {
	    	EmployeeFileIO employee1 = new EmployeeFileIO("Rifat", 123567890);
	    	EmployeeFileIO employee2 = new EmployeeFileIO("Sam", 987654321);
	    	EmployeeFileIO employee3 = new EmployeeFileIO("Cathryn", 39852441);

	    	// Create a file output stream
	    	FileOutputStream fileOutputStream = new FileOutputStream("/home/rif/eclipse-workspace/CSE215-JavaProgramming/src/employees.bin");

	    	// Create an object output stream
	    	ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

	    	// Write the 3 Employee objects to the file
	    	objectOutputStream.writeObject(employee1);
	    	objectOutputStream.writeObject(employee2);
	    	objectOutputStream.writeObject(employee3);

	    	// Close the object output stream
	    	objectOutputStream.close();
	    	// Create a file input stream
	    	FileInputStream fileInputStream = new FileInputStream("/home/rif/eclipse-workspace/CSE215-JavaProgramming/src/employees.bin");

	    	// Create an object input stream
	    	ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

	    	// Read the 3 Employee objects from the file
	    	EmployeeFileIO emp1 = (EmployeeFileIO) objectInputStream.readObject();
	    	EmployeeFileIO emp2 = (EmployeeFileIO) objectInputStream.readObject();
	    	EmployeeFileIO emp3 = (EmployeeFileIO) objectInputStream.readObject();

	    	// Close the object input stream
	    	objectInputStream.close();

	    	// Print the name and id for each Employee object
	    	System.out.println("Employee 1: " + emp1.getName() + ", " + emp1.getId());
	    	System.out.println("Employee 2: " + emp2.getName() + ", " + emp2.getId());
	    	System.out.println("Employee 3: " + emp3.getName() + ", " + emp3.getId());

	    }

}
