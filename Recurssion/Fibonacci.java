package Recurssion;

// 0 1 1 2 3 5 8 13 .......

class FindFib{
	int fib(int n){
		if (n==1) {
			return 0;
		}
		if (n==0) {
			return 0;
		}
		if (n==2) {
			return 1;
		}
		
		return (fib(n-1)+fib(n-2)); 
	}
}

public class Fibonacci {
	public static void main(String[] args) {
		FindFib obj = new FindFib();
		System.out.println("The fibonachi of n is :"+obj.fib(2
				));
	}
}
