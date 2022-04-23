import java.util.Scanner;
class Teacher {
     String destination;
	String collegename;
	void display(String destination, String collegename) {
		System.out.println("Destination  "+destination);
		System.out.println("College name: "+collegename);
	}
}

class ComputerTeacher extends Teacher {
     public static void main(String[] args) {
           Scanner s=new Scanner(System.in);
		System.out.println("Enter Destination: ");
		String s1=s.nextLine();
		System.out.println("Enter CollegeName: ");
		String s2=s.nextLine();
		ComputerTeacher T=new ComputerTeacher();
		T.display(s1,s2);
     }
}