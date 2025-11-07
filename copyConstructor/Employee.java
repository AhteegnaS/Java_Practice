package copyConstructor;

public class Employee {

	 int id;
	 String name;
	 int age;
	 String email;
	 
	public Employee(int id, String name, int age, String email) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.email = email;
	}
	 
	 public Employee(Employee another) {
		    this.id = another.id;
			this.name = another.name;
			this.age = another.age;
			this.email = another.email;
	 }
	
	 public void displayDetails() {
		 System.out.println(id);
		 System.out.println(name);
		 System.out.println(age);
		 System.out.println(email);
	 }
}
