package Arrays;

import java.util.Scanner;

public class TransposeOfMatrix {
	public static void main(String args[]) {
		int i,j;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of rows :");
		i=sc.nextInt();
		System.out.println("Enter no of columns :");
		j=sc.nextInt();
		int arr[][]= new int[i][j];
		for(int a=0;a<i;a++) {
			for(int b=0;b<j;b++) {
				System.out.printf("Element[%d,%d] :",(a+1),(b+1));
				arr[a][b]=sc.nextInt();
			}
		}
		System.out.println("The Normal Matrix is :");
		for(int a=0;a<i;a++) {
			for(int b=0;b<j;b++) {
				System.out.print(arr[a][b]+" ");
			}
			System.out.println("\n");
		}
		System.out.println("The Transpose Matrix is :");
		for(int a=0;a<j;a++) {
			for(int b=0;b<i;b++) {
				System.out.print(arr[b][a]+" ");
			}
			System.out.println("\n");
		}
	}
}
