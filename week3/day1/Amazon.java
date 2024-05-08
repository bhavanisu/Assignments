package week3.day1;

public class Amazon extends CanaraBank {

	public void CashonDelivery() {
		// TODO Auto-generated method stub
		System.out.println("cash on deliveery done");
		
	}

	public void upiPayments() {
		// TODO Auto-generated method stub
		System.out.println("upi payment done");
		
	}

	public void internetBanking() {
		// TODO Auto-generated method stub
		System.out.println("internet banking done");
		
	}

	public static void main(String[] args) {
		Amazon a = new Amazon();
		a.cardPayments();
		a.CashonDelivery();
		a.internetBanking();
		a.recordpaymentDetails();
		a.upiPayments();
	}
}
