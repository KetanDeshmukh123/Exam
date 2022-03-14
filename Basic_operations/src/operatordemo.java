
public class operatordemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double balance=2000;
		System.out.println("amount to withdraw : ");
		double amount=1200;
		if(amount<0||amount>balance)
		{
			System.out.println("withdrawl fail");
		}
		else 
		{
			balance=amount;
			System.out.println("withdrawl success...!");
		}
		System.out.println("Balance:"+balance);
	}

}
