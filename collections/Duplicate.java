package collections;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Duplicate {
	public static void main(String args[]) {
		ArrayList <Integer> arrli = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many numbers you want : ");
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			int count = i+1;
			System.out.println("Enter Number "+count + " :");
			arrli.add(sc.nextInt());
		}
		
		Set<Integer> arrli2 = new LinkedHashSet<Integer>(arrli);
		System.out.print("After removing Duplicates : "+arrli2);
	
		sc.close();
	}
}
