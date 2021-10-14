package entities;

public class Employee {
	private String name;
	private Double salary;
	private String email;
	
	public Employee(String name, Double salary, String email) {
		super();
		this.name = name;
		this.salary = salary;
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String toString() {
		return "Employee name=" 
				+ name 
				+ ", salary=" 
				+ salary 
				+ ", email=" 
				+ email;
	}
	
	
}
