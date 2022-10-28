public class Main {
	
	public static void main(String[] args) {
		
		SavingsAccount jsa = new SavingsAccount("Joe", 100, 1);
		CheckingAccount eca = new CheckingAccount("Emily", 200, 10);
		
		eca.Deposit(50);
		jsa.Deposit(25);
		
		eca.ProcessCheck(50);
		eca.Transfer(jsa, 100);
		
		SavingsAccount ssa = new SavingsAccount("Sam", 250, 0.5);
		
		ssa.DepositMonthlyInterest();
		jsa.DepositMonthlyInterest();
		
		eca.Withdraw(500);
		jsa.Withdraw(500);
		
	}
	
}