package CodingTest;

public class Employee {
	
	private int id;
	private String name;
	private double salary;
	 
	public int getId() {
		return id;
	}

    public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}


	public void displayDetails(){
		System.out.println("Employee ID : " + id + " Employee Name : " + name + " Employee Salary : " + salary);
	}
    public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setId(1);
		emp.setName("John Doe");
		emp.setSalary(50000);
		
		emp.displayDetails();

	}

}
