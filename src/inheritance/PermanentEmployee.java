package inheritance;

public class PermanentEmployee extends Employee{
	double basicPay;
	double hra;
	int experience;
	
	public PermanentEmployee() {
		this.basicPay =0;
		this.hra = 0;
		this.experience=0;
	}
	
	public PermanentEmployee(double bPay, double h, int exp) {
		this.basicPay = bPay;
		this.hra = h;
		this.experience = exp;
	}
	
	//getters setters
	public double getBasicPay() {
		return basicPay;
	}
	public void setBasicPay(double basicPay) {
		this.basicPay = basicPay;
	}
	public double getHra() {
		return hra;
	}
	public void setHra(double hra) {
		this.hra = hra;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	
	//other methods
	public void calculateSalary() {
		double varComponent;
		if(this.experience >= 10) {
			varComponent = this.basicPay*.12;
		}else if(this.experience >= 5) {
			varComponent = this.basicPay*.07;
		}else if(this.experience >= 3 ) {
			varComponent = this.basicPay*.05;
		}else {
			varComponent = 0;
		}
		super.setSalary(varComponent+this.basicPay+this.hra);
		System.out.println("cmp "+varComponent+" bpay "+this.basicPay+" hra "+this.hra+" sal "+salary);
			
	}
	/*
	public static void main(String[] args) {
		PermanentEmployee p1 = new PermanentEmployee(23.50, 5, 2);
		PermanentEmployee p2 = new PermanentEmployee(22.1, 3, 10);
		PermanentEmployee p3 = new PermanentEmployee(50, 3, 30);
		PermanentEmployee p4 = new PermanentEmployee(15, .5, 1);
		PermanentEmployee p5 = new PermanentEmployee(10000, 1500, 3);
		p1.calculateSalary();
		System.out.println(p1.getSalary());
		p2.calculateSalary();
		System.out.println(p2.getSalary());
		p3.calculateSalary();
		System.out.println(p3.getSalary());
		p4.calculateSalary();
		System.out.println(p4.getSalary());
		p5.calculateSalary();
		System.out.println("p5 "+p5.getSalary());
	}
	*/
}
