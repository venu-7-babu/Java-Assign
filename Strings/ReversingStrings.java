/*  
    Write a program to reverse a string using StringBuffer. Reverse entire sentence in string and also reverse each word in the string. 
    Prompt the user input from the terminal.
    
    Sample input: Learning made easy at bitLabs
    
    Expected output:
    reversing entire string: sbaLtib ta ysae edam gninraeL
    reversing each word at its place: gninraeL edam ysae ta sbaLtib  
*/
package Strings;

import java.util.Scanner;

public class ReversingStrings {
	public static void main(String args[]) {
		Scanner sc = new  Scanner(System.in);
		System.out.println("Enter String :");
		String str=sc.nextLine();
		sc.close();
		StringBuffer obj=new StringBuffer(str);
		System.out.println("The reverse String is :"+obj.reverse()); 
		
		String words[] = str.split(" ");
		
		String reverseWords = "";
		
		int len = words.length;
		for(int i=0;i<len;i++) {
			StringBuffer obj2 = new StringBuffer(words[i]);
			reverseWords += obj2.reverse().toString()+" ";
			
		}
		System.out.print("Reversing each word at its place :"+reverseWords);
	}
}
