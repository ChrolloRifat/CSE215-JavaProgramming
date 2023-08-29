
public class CourseClass {

	public static void main(String[] args) {
		Course course = new Course("CSE215");
		System.out.println("Course: " + course.getName());
		course.addStudent("Rifat");
		course.addStudent("Ibrahimovic");
		course.addStudent("Melanie");
		System.out.println("Total Students: " + course.getNumberOfStudents());
		for(int i = 0; i < course.getStudents().length; i++) {
			System.out.println(course.getStudents()[i]);
		}
		course.dropStudent("Rifat");
		System.out.println("Total Students: " + course.getNumberOfStudents());
		for(int i = 0; i < course.getStudents().length; i++) {
			System.out.println(course.getStudents()[i]);
		}
		

	}

}

class Course{
	private String name;
	private String[] students;
	private int numberOfStudents;
	
	Course(String name){
		this.name = name;
		students = new String[40];
		numberOfStudents = 0;
	}
	
	public String getName() {
		return name;
	}
	
	public void addStudent(String student) {
		students[numberOfStudents] = student;
		numberOfStudents++;
	}
	
	// Needs debugging
	public void dropStudent(String student) {
//		for(int i = 0; i < students.length; i++) {
//			if(students[i].equals(student)) {
//				students[i] = "";
//			}
			numberOfStudents--;
		}
	
	
	public String[] getStudents() {
		String[] studentList = new String[numberOfStudents];
		for(int i = 0; i < studentList.length; i++) {
			studentList[i] = students[i];
		}
		return studentList;
	}
	
	public int getNumberOfStudents() {
		return numberOfStudents;
	}
}
