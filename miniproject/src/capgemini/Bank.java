package capgemini;
import java.util.Scanner;
public class Bank {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.createaccount, 2.showbalance, 3.deposit, 4.withdraw, 5 fundtransfer, 6.printtransaction");
		System.out.println("enter choice");
		int choice = sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("create an account");
			CreateAccount ca = new CreateAccount();
            ca.CreateAccount();
			break;
		case 2 :
			System.out.println("showbalance");
			ShowBalance sb = new ShowBalance();
			sb.ShowBalance();
			break;
		case 3:
			System.out.println("deposit");
			Deposit d = new Deposit();
			d.Deposit();
			break;
		case 4:
			System.out.println("withdraw");
			Withdraw w = new Withdraw();
			w.Withdraw();
			break;
		case 5:
			System.out.println("fund transfer");
			FundTransfer ft = new FundTransfer();
			ft.fundTransfer();
			break;
		case 6:
			System.out.println("print transaction");
			  PrintTransaction pt = new PrintTransaction();
			  pt.printTransaction();
			break;
		}
			System.out.println("Do you want to continue");
			System.out.println("1.yes, 2.No");
			int mainMenu = sc.nextInt();
			System.out.println("1.mainMenu, 2.exit");
			switch(mainMenu) {
			case 1 :
				System.out.println("return to mainMenu");
				main(args);
			break;
			case 2:
				System.out.println("Thank you for using this bank");
			}
		
		

	}

	}
