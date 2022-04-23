import java.util.Scanner;
class Person { 
//declare age 
//create setters and getters
    private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

    
}  

class PersonEncapsulation { 

public static void main(String args[]) { 

//main method
//create Scanner object
//take input from user
// Try accessing age field of Person directly and check whether it’s accessible
// or not.If not then try accessing it with it’s setter and getter methods. 
// Output age 
    Scanner s=new Scanner(System.in);
		System.out.println("Enter age: ");
		int n=s.nextInt();
		Person p=new Person();
		p.setAge(n);
		System.out.println("Your age : "+p.getAge());

  
}   

} 