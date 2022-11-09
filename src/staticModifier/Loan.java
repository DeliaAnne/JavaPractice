package staticModifier;

public class Loan {
	int loanNo;
	int accountNo;
	int customerNo;
	float loanAmount;
	int loanDuration;
	float interest;
	private static int accountCount = 0;
	//c
	static {
		Loan.accountCount = 101;
	}
	public Loan() {
		Loan.accountCount++;
	}
	
	public Loan(int accountNo, int customerNo, float loanAmount, int loanDuration, float interest) {
		this.accountNo = accountNo;
		this.customerNo = customerNo;
		this.loanAmount = loanAmount;
		this.loanDuration = loanDuration;
		this.interest = interest;
		Loan.accountCount++;
	}
	//

	
	//g &s

	public int getLoanNo() {
		return loanNo;
	}

	public static int getAccountCount() {
		return accountCount;
	}

	public static void setAccountCount(int accountCount) {
		Loan.accountCount = accountCount;
	}

	public void setLoanNo(int loanNo) {
		this.loanNo = loanNo;
	}

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public int getCustomerNo() {
		return customerNo;
	}

	public void setCustomerNo(int customerNo) {
		this.customerNo = customerNo;
	}

	public float getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(float loanAmount) {
		this.loanAmount = loanAmount;
	}

	public int getLoanDuration() {
		return loanDuration;
	}

	public void setLoanDuration(int loanDuration) {
		this.loanDuration = loanDuration;
	}

	public float getInterest() {
		return interest;
	}

	public void setInterest(float interest) {
		this.interest = interest;
	}
	
}
