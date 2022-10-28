public class BankAccount {
	String owner;
	double balance;
	
	public BankAccount(String owner, double balance)
	{
		this.owner = owner;
		this.balance = balance;
	}
	
	public void Deposit(double amount)
	{
		balance += amount;
		System.out.println(owner + "'s account: " + balance);
	}
	
	public void Withdraw(double amount)
	{
		balance -= amount;
		System.out.println(owner + "'s account: " + balance);
	}
	
	public void Transfer(BankAccount a, double amount)
	{
		balance -= amount;
		a.balance += amount;
		
		System.out.println(owner + "'s account: " + balance);
		System.out.println(a.owner + "'s account: " + a.balance);
	}
}