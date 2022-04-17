


package Strings;

import java.util.Scanner;

public class SubStringSearch {
	public static void main(String args[]) {
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The String :");
		str = sc.nextLine();
		System.out.println("Enter the search string :");
		String searchStr = sc.nextLine();
		sc.close();
		boolean bool =str.contains(searchStr);
		if(bool==true) {
			System.out.println("String Found");
		}
		else {
			System.out.println("String not foud");
		}

	}
	
}
