package capgemini;
import java.util.*;

public class CreateAccount {
	String name;
	int pin, age,confirmpin;
	long  phoneNumber;
	Double aadhar;
	//int withdraw, deposit, balance;
	Scanner sc = new Scanner(System.in);
	public void CreateAccount() {
		
	System.out.println("enter the name");
	String name = sc.next();
	System.out.println("enter phone number");
	long phoneNumber = sc.nextLong();
	System.out.println("enter age");
	int age = sc.nextInt();
	System.out.println("enter pin");
	int pin = sc.nextInt();
	System.out.println("Confirm your pin");
	confirmpin = sc.nextInt();
	if(pin == confirmpin) {
		System.out.println("your pin is generated successfully");
		System.out.println("account is created successfully");
	}
	else {
		System.out.println("incorrect pin");
	}
	
	}
		
	}


