import java.util.*;
class WithdrawingMoreThanBalance extends Exception
{
	WithdrawingMoreThanBalance(String s)
	{
		super(s);
	}
}
class BankAccount
{
	private String account_no;
	private double balance;
	
	BankAccount(String account_no, double balance)
	{
		this.account_no = account_no;
		this.balance = balance;
	}
	void getDetails()
	{
		System.out.println(account_no);
		System.out.println(balance);
	}
	public void deposit(double depositAmt)
	{
		balance = balance + depositAmt;
	}
	public void withdraw(double withdrawAmt) throws WithdrawingMoreThanBalance
	{
		if (balance < withdrawAmt)
		{
			throw new WithdrawingMoreThanBalance("Balance is less than the Withdrawal Amount !...");
		}
		else
		{
			balance = balance - withdrawAmt;
		}
	}
}
public class demo2
{
	public static void main(String args[])
	{
		BankAccount bnk1 = new BankAccount("ABC123", 4000.20);
		BankAccount bnk2 = new BankAccount("XYZ", 205);
		Scanner inp = new Scanner(System.in);
		
		System.out.println("\nAccount number and Balance of user 1 :");
		bnk1.getDetails();
		System.out.println("Account number and Balance of user 2 :");
		bnk2.getDetails();
		
		double d1 = inp.nextDouble();
		double d2 = inp.nextDouble();
		bnk1.deposit(d1);
		bnk2.deposit(d2);
		System.out.println("\nAdding Rs."+d1+" to account 1");
		System.out.println("Adding Rs."+d2+" to account 2");
		
		System.out.println("\nAccount number and Balance of user 1 :");
		bnk1.getDetails();
		System.out.println("Account number and Balance of user 2 :");
		bnk2.getDetails();
		
		double w1 = inp.nextDouble();
		double w2 = inp.nextDouble();
		try
		{
		bnk1.withdraw(w1);
		System.out.println("\nWithdrawing Rs."+d1+" from account 1");
		bnk2.withdraw(w2);
		System.out.println("Withdrawing Rs."+d2+" from account 2");
		}
		catch(WithdrawingMoreThanBalance e)
		{
			System.out.println(e);
		}
		
		System.out.println("\nAccount number and Balance of user 1 :");
		bnk1.getDetails();
		System.out.println("Account number and Balance of user 2 :");
		bnk2.getDetails();
	}
}