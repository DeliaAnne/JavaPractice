
public class Bill {
	
	public static void printDiscount(int bId, int cId, int dsc, double bAmount) {
		double dBAmount = bAmount - bAmount*(dsc/100);
		switch(bId) {
			case 1001,1002,1004:
				System.out.println('a');
			case 1003:
				System.out.println('b');
				break;
			default:
				System.out.println('c');
		}
		System.out.println("Bill: "+bId+" for customer: "+cId+" Discount awarded! "+dBAmount);
	}
	
	public static void main(String[] args) {

	    int phone[] = new int[3];   // primitive type array
	    phone[0] = 7120686;
	    phone[1] = 7120687;       // inserting element in an array
	    phone[2] = 7120684;
	    int count = 1;
	    for(int i = 0; i < phone.length; ++i) {   // traversing an array
	      System.out.println("phone number " + count + ": " + phone[i]);
	      ++count;
	    }
	    
	    for(double i: phone) {
	    	System.out.println(i);
	    }
	    
		printDiscount(1001, 101, 2, 199.99);
		printDiscount(1002, 102, 4, 210.5);
	}
}
