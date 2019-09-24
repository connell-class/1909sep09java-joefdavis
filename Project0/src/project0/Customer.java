package project0;

public class Customer extends Person {
	
	private String email;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Customer(String name, String dob, String username, String password, String email) {
		super(name, dob, username, password);
		this.email = email;
	}

	@Override
	public String toString() {
		return "Customer [email=" + email + ", getName()=" + getName() + ", getDob()=" + getDob() + ", getUsername()="
				+ getUsername() + ", getPassword()=" + getPassword() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
}
