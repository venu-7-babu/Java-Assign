package OOPs;

import java.util.Scanner;

class BankDetails{
	private long acc_no;
	private double balance;
	public long getAcc_no() {
		return acc_no;
	}
	public void setAcc_no(long acc_no) {
		this.acc_no = acc_no;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
}

public class Encaptulation2 {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	BankDetails obj = new BankDetails();
	System.out.println("Enter Account No :");
	obj.setAcc_no(sc.nextLong());
	System.out.println("Enter current balance :");
	obj.setBalance(sc.nextDouble());

	sc.close();
	System.out.println("Your Account no :"+obj.getAcc_no());
	System.out.println("Your Current balance is :"+obj.getBalance());

	}
}
