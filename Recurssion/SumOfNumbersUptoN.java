package Recurssion;

//1+2+ ..... n-1+n

class Sum{
	int SumN(int n) {
		if(n==0) {
			return 0;
		}
		int left_part = SumN(n-1);
		
		return left_part+n;
	}
}



public class SumOfNumbersUptoN {
	public static void main(String[] args) {
		Sum obj = new Sum();
		System.out.println("The OF N Numbers is :"+obj.SumN(5));
		
		
	}
}
