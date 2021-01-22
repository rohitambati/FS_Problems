class BankAccount
{
	int balance;
	String accNumber;
	String accName;
	
	public BankAccount(String accName, String accNumber, int balance)
	{
		this.accName = accName;
		this.accNumber = accNumber;
		this.balance = balance;
	}

	public void deposit(int amount)
	{
		balance += amount;            
	}

	public boolean withdraw(int amount)
	{
		if(amount > balance)
			return false;		
		balance -= amount;		
		return true;
	}

	public void show()
	{
		System.out.println("Account name is " +  accName);
		System.out.println("Account number is " +  accNumber);
		System.out.println("Account balance is " +  balance);
	}

	public static void main(String args[])
	{
		BankAccount customer1 = new BankAccount("Cust1", "101",  15000);
		customer1.deposit(4000);

		if(!customer1.withdraw(28000) )
		{
			System.out.println("Insufficient funds in " +  customer1.accNumber);
		}
		customer1.show();
	}	
}