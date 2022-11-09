package inheritance;

public class ContractEmployee extends Employee{
	double wages;
	int hours;
	String test;
	//
	public ContractEmployee() {
	}
	
	public ContractEmployee(double wages, int hours) {
		this.wages = wages;
		this.hours = hours;
	}
	
	//
	public double getWages() {
		return wages;
	}
	public void setWages(double wages) {
		this.wages = wages;
	}
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	//
	public void calculateSalary() {
		salary = this.hours * this.wages;
	}
	
	/**/
	public static void main(String[] args) {
		ContractEmployee c1 = new ContractEmployee(500,10);
		c1.calculateSalary();
		System.out.println(c1.getSalary());
	}
	
}
