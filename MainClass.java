package Bank;

import java.util.Scanner;

public class MainClass 
{
	public static void main(String args[])
	{
		AtmOperationInterface atm = new AtmOperation();
		Scanner s = new Scanner(System.in);
		System.out.println("Welcome to ATM Machine !!!");
		System.out.print("Enter Atm Number: ");
		String atmNumber = s.nextLine();
		System.out.print("Enter Pin: ");
		String pass = s.nextLine();
		boolean bol = true;
		while(bol)
		{
			System.out.println("1.View Available Balance\n2.Withdraw Amount\n3.Deposit Amount\n4.View Ministatement\n5.Exit");
			System.out.print("Enter Choice: ");
			int scase = s.nextInt();
			switch(scase)
			{
				case 1:
					atm.viewBalance();
					break;
				case 2:
					System.out.print("Enter amount to withdraw: ");
					double withdraw = s.nextDouble();
					atm.withdrawAmount(withdraw);
					break;
				case 3:
					System.out.print("Enter Amount to Deposit: ");
					double deposit = s.nextDouble();
					atm.depositAmount(deposit);
					break;
				case 4:
					atm.viewMiniStatement();
					break;
				case 5:
					System.out.println("Collect your ATM Card\nThank you for using ATM Machine!!");
					bol = false;
					break;
				default:
					System.out.println("Invalid input please enter again!");
					break;
			}
		}
		
	}

}
