package project0;

abstract class Person {
	
	private String name;
	private String dob;
	private String username;
	private String password;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Person(String name, String dob, String username, String password) {
		super();
		this.name = name;
		this.dob = dob;
		this.username = username;
		this.password = password;
	}

	

}
