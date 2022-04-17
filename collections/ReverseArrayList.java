package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ReverseArrayList {
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
		Collections.reverse(arrli);
		System.out.print("Elements after reversing : ");
        for (Integer value : arrli ) {
            System.out.print(" "+value);
        }
		sc.close();
	}
}
