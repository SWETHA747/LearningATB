package CodingTest;

public class BankAccount {
	private double balance;

	public void deposit(double amount)
	{
		if(amount > 0) {
			balance = balance + amount;
			System.out.println("Balance after deposit :" + balance);
		}
	}
	
	public void withdraw(double amount)
	{
		if(amount>0 && amount<=balance)
		{
			balance = balance - amount;
			System.out.println("Balance after withdrawl :" + balance);
		}
		else
		{
			System.out.println("Invalid withdrawl");
		}
	}
	
	public static void main(String[] args) {
		 BankAccount myaccount = new BankAccount();
		 
		 myaccount.deposit(50000);
		 myaccount.withdraw(30000);
		 //myaccount.withdraw(60000);

	}

}
