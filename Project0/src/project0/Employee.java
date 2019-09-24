package project0;

public class Employee extends Person {

	private String EmployeeID;

	public String getEmployeeID() {
		return EmployeeID;
	}

	public void setEmployeeID(String employeeID) {
		EmployeeID = employeeID;
	}

	public Employee(String name, String dob, String username, String password, String employeeID) {
		super(name, dob, username, password);
		EmployeeID = employeeID;
	}

	@Override
	public String toString() {
		return "Employee [EmployeeID=" + EmployeeID + ", Name: " + getName() + ", DOB: " + getDob()
				+ ", Username: " + getUsername() + ", Password: " + getPassword() 
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
}
