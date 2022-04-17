
package Arrays;

import java.util.Scanner;

public class ArraySum {
	public static void main(String args[]) {
		Scanner sc =new Scanner(System.in);
		int arr[] = new int[10];
		int sum=0;
		System.out.println("Enter 10 numbers :");
		for(int i : arr) {
			arr[i]=sc.nextInt();
			sum += arr[i];
		}
		sc.close();
		System.out.println("The sum of array is :"+sum);
		
		
	}
}
