package Strings;

import java.util.Scanner;

public class Palindrome {
	public static void main(String args[]) {
		Scanner sc = new  Scanner(System.in);
		System.out.println("Enter the string :");
		String str =sc.nextLine();
		sc.close();
		str = str.toLowerCase();
		int len = str.length();
		int i=0,j=len-1,count=0;
		while(i<len && j>=0) {
			if(str.charAt(i)!=str.charAt(j)) {
				count=1;
				break;
			}
			i++;
			j--;
			
		}
		if(count==0) {
			System.out.println("It is Palindrome");
		}
		else {
			System.out.println("It is not palindrome");
		}
	}
}
