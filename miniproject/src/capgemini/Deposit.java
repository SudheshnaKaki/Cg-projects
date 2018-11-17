package capgemini;
import java.util.*;
public class Deposit {
	double deposit;
	Scanner sc = new Scanner(System.in);
	ShowBalance sb = new ShowBalance();
	public void Deposit() {
		System.out.println("enter the name");
		String name = sc.next();
		
		System.out.println("enter pin");
		int pin = sc.nextInt();
		System.out.println("Enter the amount to deposit");
		deposit = sc.nextDouble();
		sb.balance = sb.balance + deposit;
		System.out.println(sb.balance);
		
	}
	

}
