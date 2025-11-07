package copyConstructor;

public class Student {
 int id;
 String name;
 int age;
 int marks;
 String email;
 
 static int count ;
 static {
	 System.out.println("Static block");
	 count = 1;
 }
	
 public Student() {
	 System.out.println("Constructor Example Execution");
    id = 10;
    name= " Ramu";
	age = 25;
    marks = 85;
	email = "Ramu@Kodnest.com"; 
 }
	
 {
	 System.out.println("Instance block");
	    id = 20;
	    name= " Ramuji";
		age = 23;
	    marks = 80;
		email = "Ramuji@Kodnest.com"; 
 }
	public static void printStudentCount() {
		System.out.println(count);
	}
	
	public void displayDetails() {
		System.out.println(id + " " + name + " " + age + " " + marks + " " + email);
	}
}
