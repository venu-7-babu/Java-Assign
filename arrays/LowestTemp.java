import java.util.Scanner;

public class LowestTemp {
	public static void main(String args[]) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter no days :");
		int days = sc.nextInt();
		float[] arr = new float[days];
		for(int i=0;i<days;i++) {
			System.out.println("Enter Temperature of day :"+(i+1) );
			arr[i]=sc.nextFloat();
		}
		float min=arr[0];
		for(int i=1;i<days;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		sc.close();
		System.out.println("The lowest temp is :"+min);
		
	}
}
