public class CheckingAccount extends BankAccount{

	double insufficientFundsFee;
	public CheckingAccount(String owner, double balance, double iff) 
	{
		super(owner, balance);
		this.insufficientFundsFee = iff;
	}
	
	public void ProcessCheck(double checkAmount)
	{
		balance += checkAmount;
		System.out.println(owner + "'s account: " + balance);
	}
	
	public void Withdraw(double amount)
	{
		balance -= amount;
		if(balance <= 0)
		{
			balance -= insufficientFundsFee;
		}
		System.out.println(owner + "'s account: " + balance);
	}
	
}