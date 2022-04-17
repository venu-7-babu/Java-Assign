

import java.util.Scanner;

public class PrimeNumbersInBetween {
	public static void main(String args[]){
		int num1,num2,i,j;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Starting Number : ");
		num1=sc.nextInt();
		System.out.println("Enter ending number :");
		num2 = sc.nextInt();
		sc.close();
		for (i=num1;i<=num2;i++){
			j=2;
			boolean b = true;
			while (j<=i/2) {
				if(i%j==0) {
					b=false;
					break;
				}
				j++;
			}
			if (b) {
				System.out.println(i);
			}
		}
    }
    
}

