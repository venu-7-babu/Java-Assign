package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class CopyArrayList {
		public static void main(String args[]) {
		ArrayList <Integer> arrli = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many numbers you want : ");
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("Enter Number "+i + " :");
			arrli.add(sc.nextInt());
		}
		
		ArrayList<Integer> arrli2=arrli;
		System.out.println("-----Iterating over the second ArrayList----");
	    for (Integer value : arrli2 ) {
	            System.out.println(value);
	    }
	    sc.close();
	}
	

}
