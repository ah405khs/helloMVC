package model;

public class Customer {

	private String name;
	private String id;
	private String gender;
	private String password;
	private String email;
	
	public Customer(String id, String password,String name , String gender, String email) {

		this.id = id;
		this.name = name;
		this.password = password;
		this.email = email;
		this.gender = gender;
	}

	public String getId() {
		return id;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
