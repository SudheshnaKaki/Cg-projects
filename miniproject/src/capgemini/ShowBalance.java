package capgemini;
import java.util.*;
public class ShowBalance {
	String name;
	int pin;
	static double balance = 1500;
	Scanner sc = new Scanner(System.in);
	public void ShowBalance() {
		System.out.println("enter the name");
		String name = sc.next();
		System.out.println("enter pin");
		int pin = sc.nextInt();
		System.out.println("the total balance is"+balance);
		if(balance < 500) {
			System.out.println("the total balance is minimum");
		}
	}

}
