package OOPs;

class Teacher{
	String designation ="Teacher";
	String CollegeName ="IIT" ;
	void work(){
		System.out.println("work is teaching");
	}
}
class ComputerTeacher extends Teacher {
	
	String designation = "Computer Teacher";
}
class MathsTeacher extends Teacher {
	
	String designation = "Maths Teacher";
}
class EnglishTeacher extends Teacher {
	
	String designation = "English Teacher";
}
class MusicTeacher extends Teacher {
	
	String designation = "Music Teacher";
}



public class Inheritance {
	public static void main(String args[]) {
		MathsTeacher obj1 = new MathsTeacher();
		EnglishTeacher obj2 = new EnglishTeacher();
		MusicTeacher obj3 = new MusicTeacher();

		System.out.println("Designation   CollegeName ");
		System.out.println(obj1.designation+"   "+obj1.CollegeName );
		
		System.out.println(obj2.designation+"   "+obj2.CollegeName );
		
		System.out.println(obj3.designation+"    "+obj3.CollegeName );
		obj3.work();
	}
}
