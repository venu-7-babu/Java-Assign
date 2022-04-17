/* 
    Write a program to find a substring in a string without using an inbuilt method of String class.
    Prompt the user input from the terminal.
    
    Sample input: Learning made easy at bitLabs
    Enter search string: bitLabs
    
    Expected output: bitLabs is found
    
    Enter search string: bitlab
    Expected output: bitlab is not found
*/
package Strings;

import java.util.Scanner;

public class IsSubString{
	public static void main(String args[]) {
		String str1,str2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string :");
		str1 = sc.nextLine();
		System.out.println("Enter the string you want to search for :");
		str2 = sc.nextLine();
		sc.close();
		if(isSubString(str1,str2)) {
			System.out.println("It is sub String");
		}
		else {
			System.out.println("Is not sub string");
		}
	}
	public static boolean isSubString(String str1,String str2) {
		boolean match = false ;
		for(int i=0;i<str1.length();i++) {
			if(str1.charAt(i) == str2.charAt(0)) {
				int k=0;
				for(int j=i;j<i+str2.length();j++) {
					if(str1.charAt(j)==str2.charAt(k)) {
						match=true;
					}
					else {
						match=false;
						break;
					}
					k++;
				}
					
			}
		}
		
		return match;
	}
}
