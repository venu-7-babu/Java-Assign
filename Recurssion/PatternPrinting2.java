package Recurssion;
/*
1234..n
123
12
1
12
123
123..n
*/

class PrintingPattern{
	void printPattern(int n) {
		if(n==1) {
			System.out.println("1");
			return ;
		}
		
		for(int i =1;i<=n;i++) {
			System.out.print(i);
		}
		System.out.println("");
		
		printPattern(n-1);
		
		for(int i =1;i<=n;i++) {
			System.out.print(i);
		}
		System.out.println("");
	}
}

public class PatternPrinting2 {
	public static void main(String[] args) {
		PrintingPattern obj = new PrintingPattern();
		obj.printPattern(5);
	}
}
