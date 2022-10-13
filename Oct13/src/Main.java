public class Main {
	
	public static void main(String[] args) {
		
		BankAccount caseyAccount = new BankAccount("Casey", 300);
		
		caseyAccount.display();
		
		caseyAccount.deposit(40.50);
		caseyAccount.withdraw(27.87);
		
		caseyAccount.display();
		
		
		BankAccount danAccount = new BankAccount("Dan", 500);
		danAccount.owner = "Dan";
		danAccount.balance = 500;
		
		danAccount.display();
		
		danAccount.withdraw(501);
		
		danAccount.display();
	}
	
}