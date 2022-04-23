public class Sport {
	String name;
	// Create a member variable for Sport name 
	Sport(String name) {
	this.name=name;
	}
	void display() {
		System.out.println("Sport name : "+name);
	}
	// Set member variable for Sport name 
public static void main(String args[]) { 

	// Create object for Sport class 
		Sport s1=new Sport("Football");
		s1.display();

	// Print the value of Sport name using "this" reference

} 

} 