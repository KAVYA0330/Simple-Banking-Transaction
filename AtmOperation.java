package Bank;

import java.util.ArrayList;

public class AtmOperation implements AtmOperationInterface
{
	Atm atm = new Atm();
	ArrayList<String> l = new ArrayList<>();
	@Override
	public void viewBalance() 
	{
		double balance = atm.getBalance();
		System.out.println("Available Balance is :"+balance);
		
	}

	@Override
	public void withdrawAmount(double withdrawAmount) 
	{
		double balance = atm.getBalance();
		if(withdrawAmount > balance)System.out.println("Insufficient Balance !!");
		else
		{
			balance -= withdrawAmount;
			System.out.println("Collect the Cash "+withdrawAmount);
			String str = String.valueOf(withdrawAmount);
			str += "Amount Withdrawn";
			l.add(str);
			atm.setBalance(balance);
		}
	}

	@Override
	public void depositAmount(double depositAmount) 
	{
		double balance = atm.getBalance();
		double currentBalance = balance+depositAmount;
		System.out.println(currentBalance+" Deposited Successfully !!");
		atm.setBalance(currentBalance);
		String str = String.valueOf(depositAmount);
		str += " Amount Deposited";
		l.add(str);
		System.out.println("Available Balance is: "+atm.getBalance());
		
	}

	@Override
	public void viewMiniStatement() 
	{
		for(String i: l)System.out.println(i);
	}

}
