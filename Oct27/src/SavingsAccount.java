public class SavingsAccount extends BankAccount{

	double annualInterestRate;
	public SavingsAccount(String owner, double balance, double ari) 
	{
		super(owner, balance);
		this.annualInterestRate = ari;
	}
	
	public void DepositMonthlyInterest()
	{
		double mi = (annualInterestRate/10);
		balance += mi;
		System.out.println(owner + "'s account: " + balance);
	}
	
	public void Withdraw(double amount)
	{
		if(amount >= balance)
		{
			System.out.println("Error: Insufficient Funds");
		}
		else
		{
			balance -= amount;
			System.out.println(owner + "'s account: " + balance);
		}
	}
	
}