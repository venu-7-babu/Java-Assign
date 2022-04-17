package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortArrayList {
	public static void main(String args[]) {
		ArrayList <Integer> arrli = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many numbers you want : ");
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			int j=i+1;
			System.out.println("Enter Number "+j + " :");
			arrli.add(sc.nextInt());
		}
		Collections.sort(arrli);
		System.out.println("ArrayList After Sorting : ");
	    for (Integer value : arrli ) {
	            System.out.println(value);
	    }
	    sc.close();
	}
}
