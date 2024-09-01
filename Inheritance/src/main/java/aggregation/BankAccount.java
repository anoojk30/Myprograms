package aggregation;

public class BankAccount {
	Details details;
	String accountType;
	int balance;
	BankAccount(String accountType,int balance,Details details)
	{
		this.details=details;
		this.accountType=accountType;
		this.balance=balance;
	}
public void show()
{
	System.out.println(accountType+ "  "+balance);
	System.out.println(details.bank+ " "+details.ifsc+ " "+details.name);
}
public static void main(String args[])
{
	Details obj=new Details("SBI","CBRN","Anooj");
	BankAccount obj1=new BankAccount("Savings",256700,obj);
	obj1.show();
}
}