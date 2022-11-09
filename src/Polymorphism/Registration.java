package Polymorphism;

public class Registration {
	String customerName;
	String panCardNo;
	int voterId;
	String passportNo;
	int licenseNo;
	long[] telephone;
	//constructors
	public Registration(String customerName, String passportNo, long[]telephoneNo) {
		this.customerName = customerName;
		this.passportNo = passportNo;
		this.telephone = telephoneNo;
	}
	
	public Registration(String customerName, int licenseNo, String panCardNo, long[]telephoneNo) {
		this.customerName = customerName;
		this.licenseNo = licenseNo;
		this.panCardNo = panCardNo;
		this.telephone = telephoneNo;
	}
	
	public Registration(String customerName, int voterId, int licenseNo, String panCardNo, long[]telephoneNo) {
		this.customerName = customerName;
		this.voterId = voterId;
		this.licenseNo = licenseNo;
		this.panCardNo = panCardNo;
		this.telephone = telephoneNo;
	}
	
	public Registration(String customerName, String panCardNo, int voterId, long[]telephoneNo) {
		this.customerName = customerName;
		this.panCardNo = panCardNo;
		this.voterId = voterId;
		this.panCardNo = panCardNo;
		this.telephone = telephoneNo;
	}
	//GETTERS ONLY

	public String getCustomerName() {
		return customerName;
	}

	public String getPanCardNo() {
		return panCardNo;
	}

	public int getVoterId() {
		return voterId;
	}

	public String getPassportNo() {
		return passportNo;
	}

	public int getLicenseNo() {
		return licenseNo;
	}

	public long[] getTelephone() {
		return telephone;
	}
	
	
}
