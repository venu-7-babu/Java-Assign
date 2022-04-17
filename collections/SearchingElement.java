package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchingElement {
	public static void main(String args[]) {
		ArrayList <String> arrli = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many elements you want : ");
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			int j = i+1;
			System.out.println("Enter element "+j + " :");
			arrli.add(sc.next());
		}
		
		System.out.println("Enter the element you watnt to search : ");
		String str = sc.next();
		
		if(arrli.contains(str)) {
			System.out.println(str+" element is present");
		}
		else {
			System.out.println(str +" element is not present");
		}
		
		sc.close();
	}
}
