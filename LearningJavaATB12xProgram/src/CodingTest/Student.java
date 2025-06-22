package CodingTest;

public class Student {

	String name ;
	int rollNo;
	char section;
	
	public Student(String name, int rollNo, char section) {
		
		this.name = name;
		this.rollNo = rollNo;
		this.section = section;
	}
	
	public void displayDetails(){
		System.out.println("Student : " + name +"," + " Roll No : " + rollNo+ "," + " Section : " + section);
	}

	
	public static void main(String[] args) {
		Student student = new Student("Bob", 101 , 'A');
		
		student.displayDetails();

	}

}
