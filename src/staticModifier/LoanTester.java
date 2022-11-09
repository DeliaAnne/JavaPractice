package staticModifier;

public class LoanTester {
	//int accountNo, int customerNo, float loanAmount, int loanDuration, float interest
	public static void main(String[] args) {
		Loan l = new Loan(101,1001,500.01f, 5, 6.25f);
		System.out.println( Loan.getAccountCount());
		Loan l2 = new Loan(101,1001,500.01f, 5, 6.25f);
		System.out.println( Loan.getAccountCount());
	}
	
	
}
