package inheritance;

public class Employee {
	int empId;
	String name;
	double salary;
	
	public Employee() {
		System.out.println("EMPLOYEE");
	}
	
	public double getSalary() {
		return this.salary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}
