package CodingTest;

public class Person {

	String name;
	int age;

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public void displayDetails() {
		System.out.println("Name: " + name + " Age: " + age);
	}

	public static void main(String[] args) {
		Person person1 = new Person("John", 25);
		Person person2 = new Person("Alice", 30);

		person1.displayDetails();
		person2.displayDetails();

	}
}
