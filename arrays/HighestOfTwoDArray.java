package Arrays;

import java.util.Scanner;

public class HighestOfTwoDArray {
	public static void main(String args[]) {
		int i,j,x=0,y=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of rows :");
		i=sc.nextInt();
		System.out.println("Enter no of columns :");
		j=sc.nextInt();
		int max=0;
		int arr[][]= new int[i][j];
			for(int a=0;a<i;a++) {
			for(int b=0;b<j;b++) {
				System.out.printf("Element[%d,%d] :",(a+1),(b+1));
				arr[a][b]=sc.nextInt();
				if(arr[a][b]>max) {
					max=arr[a][b];
					x=a+1;
					y=b+1;
				}
			}
		}
		sc.close();
		System.out.printf("Largest elements is %d and It's index position is [%d][%d]",max,x,y);
	}
}
