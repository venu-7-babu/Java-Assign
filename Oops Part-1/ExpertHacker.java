import java.util.Scanner;
public class BankAccount {
	//declare account_number , account_balance
    private static int Account_number;
    private double balance;
	//create getters and setters
	public static int getAccount_number() {
		return Account_number;
	}
	public static void setAccount_number(int account_number) {
		Account_number = account_number;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	   
	   public void display(int account_number,double balance){
	       System.out.println("Acoount number :"+account_number);
	       System.out.println("Current balance : "+balance);
	   }
	}  

	class ExpertHacker { 

	public static void main(String args[]) { 

	//main method

	//create Scanner object
     Scanner s=new Scanner(System.in);
	//Take input from user
     System.out.println("Enter bank account number: ");
     int n=s.nextInt();
     System.out.println("Enter current balance: ");
     double m=s.nextDouble();
	//Create an object of BankAccount class and set account_number and the account_balance
    BankAccount s1=new BankAccount();
	// Try accessing fields of BankAcccount class and check whether it's accessible 
     System.out.println(s1.setBalance(m));
    System.out.println(s1.setAccount_number(n));
	// or not. If not then try accessing it with it’s setter and getter methods. 
	// Print account_number and account_balance 

	}   
}