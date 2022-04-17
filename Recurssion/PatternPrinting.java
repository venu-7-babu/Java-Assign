package Recurssion;

class PatternPrint{
	void patternPrint(int n) {
		if(n==0) {
			return;
		}
		
		patternPrint(n-1);
		for(int i=1;i<=n;i++) {
			System.out.print(i);
		}
		System.out.println();
	}
}


public class PatternPrinting {
	public static void main(String[] args) {
		PatternPrint obj = new PatternPrint();
		obj.patternPrint(10);
	}
}
