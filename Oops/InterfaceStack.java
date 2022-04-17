/*
 Sample Input:
     Enter a a few comma separated integers (Ex: 1,7,4)
     1,2,3,4,5
     Expected Output:
     Fixed Stack Overflows. Failed to push the integer:4
     Dynamic Stack Overflow. Increasing the stack length...Done
     Fixed Stack Overflows. Failed to push the integer:5
     Dynamic Stack Overflow. Increasing the stack length...Done
     Printing all elements of Fixed Stack
     3
     2
     1
     Printing all elements of Dynamic Stack
     5
     4
     3
     2
     1
*/



package OOPs;

import java.util.Scanner;

interface MyStack {
	int push(int[] arr,int size);
}

class FixedStack implements MyStack{
	
	int stack[];
	int top=0;
	
	@Override
	public int push(int[] I,int size) {
		int temp = size;
		stack = new int[size];
		for(int i:I) {
			if(top<stack.length) {
				stack[top]=i;
				top++;
			}
			else {
				System.out.println("Fixed Stack Overflow. Failed to push the integer :"+i);
				System.out.println("Dynamic Stack Overflow. Increasing the stack length...Done");				
				temp++;
			}
		}
		return temp;
		
	}
}



class DynamicStack implements MyStack{

	int Dstack[] ;
	int top=0;
	
	@Override
	public int push(int[] arr,int size) {
		
		Dstack = new int[size];
		for(int i:arr) {
				Dstack[top]=i;
				top++;
		}
		return 0;
	}	
}



public class InterfaceStack {
	public static void main(String args[]) {
		System.out.println("Enter a few comma separated integers (Ex: 1,7,4)");
		Scanner sc =new Scanner(System.in);
		String string=sc.next();
		String str[] = string.split(",");
		int size = str.length;
	    int [] arr = new int [size];
	    for(int i=0; i<size; i++) {
	       arr[i] = Integer.parseInt(str[i]);
	    }
		
	    int size1=3;
	    FixedStack obj  =new FixedStack();
	    size1 = obj.push(arr,size1);
		
	    System.out.println("Printing all the elements of Fixed stack");
	    for(int i:obj.stack) {
	    	System.out.println(i);
	    }
	    
	    
	   DynamicStack obj2 = new DynamicStack();
	    obj2.push(arr,size1);
	    	    
	    System.out.println("Printing all the elements of Dynamic stack");
	    for(int i:obj2.Dstack) {
	    	System.out.println(i);
	    }
	    
		sc.close();
	}
}
