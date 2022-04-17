package Recurssion;

public class Hello {
	public static void main(String[] args) {
		
		SayHello obj = new SayHello();
		obj.sayHello(45);
	}
}

class SayHello{
	void sayHello(int n) {
		if(n==0) {
			return;
		}
		
		sayHello(n-1);
		System.out.println("Helllo "+n);
	} 
}