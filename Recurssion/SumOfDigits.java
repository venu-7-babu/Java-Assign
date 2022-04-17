package Recurssion;

//1234 digitsum(123) +4

class DigitsSum{
	int DigitSum(int n) {
		if(n==0) {
			return 0;
		}
		return DigitSum(n/10) + n%10  ;
	}
}


public class SumOfDigits {
	public static void main(String[] args) {
		DigitsSum obj = new DigitsSum();
		
		System.out.println("The Digits sum is : "+obj.DigitSum(4563));
	}
}
