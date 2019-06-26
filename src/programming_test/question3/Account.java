package programming_test.question3;
import programming_test.question3.InsufficientBalanceException;
import programming_test.question3.InvalidDepositException;

public class Account {
	private int accountNumber;
	private int balance;
	private static int totalAccounts;
	
	public Account(int accountNumber,int balance) {
		totalAccounts++;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public void deposit(int amount) throws InvalidDepositException{
		if(amount>0){
			this.balance+=amount;
			System.out.println("After deposite "+amount+" to your balance the total balace now is "+this.balance);	
		}else {
			
			throw new InvalidDepositException();	
		}
		
	}
	public void withdraw(int amount) throws InsufficientBalanceException{
		if(this.balance>=amount) {
			this.balance-=amount;
			System.out.println("After withdraw "+amount+" to your balance the total balace now is "+this.balance);			
		}else {
			throw new InsufficientBalanceException();
		}
	}

	public static void main(String[] args) {
		
		Account account1 = new Account(111,100);
		Account account2 = new Account(222,100);
		Account account3 = new Account(333,100);
		
		try {
			account1.deposit(200);
		}catch(InvalidDepositException e) {
			System.out.println(e.getMessage());
		}
		try {
			account2.withdraw(300);
		}catch(InsufficientBalanceException e) {
			System.out.println(e.getMessage());
		}
		try {
			account3.deposit(-100);
		}catch(InvalidDepositException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Total number of accounts are "+Account.totalAccounts);

	}

}
