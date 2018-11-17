package capgemini;
import java.util.*;
public class Withdraw {
	double Withdraw;
	Scanner sc = new Scanner(System.in);
	ShowBalance sb = new ShowBalance();
public void Withdraw() {
	System.out.println("enter the name");
	String name = sc.next();
	System.out.println("enter phone number");
	int phoneNumber = sc.nextInt();
	System.out.println("enter pin");
	int pin = sc.nextInt();
	System.out.println("Enter the amount to withdraw");
	Withdraw = sc.nextDouble();
	sb.balance = sb.balance - Withdraw;
	System.out.println(sb.balance);
}
}
