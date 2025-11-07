package copyConstructor;

public class EmployeeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee(102, "Rajeev", 45,"Rajeev@aaams.com");
		Employee empCopy = new Employee(emp);
        emp.id = 103;
        emp.name = "Ramya";
        emp.age = 23;
        emp.email = "agsjg@xnj.com";
        
        emp.displayDetails();
        empCopy.displayDetails();
	}

}
