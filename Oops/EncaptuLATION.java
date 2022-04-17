package OOPs;

import java.util.Scanner;

class Person{
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}

public class EncaptuLATION {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Age :");
		Person obj = new Person();
		obj.setAge(sc.nextInt());
		sc.close();
		System.out.println("Your age is :"+obj.getAge());
		
	}

}
