public class Teacher {
	String collegename ="IIT";
}
//Add MathTeacher class
public class MathTeacher extends Teacher{
	String MT="Math Teacher        ";
	}
//Add EnglishTeacher class
public class EnglishTeacher extends Teacher{
	String ET="English Teacher     ";
}

//Add MusicTeacher class
public class MusicTeacher extends Teacher{
	String MT2="Music Teacher       ";
	}
class CollegePrincipal {

//Add the main method here and create all different types of Teacher objects and print there college name designation.
public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		Teacher P=new Teacher();
		MathTeacher c2=new MathTeacher();
		System.out.println(c2.MT +c2.collegename);
		EnglishTeacher c1=new EnglishTeacher();
		System.out.println(c1.ET+c1.collegename);
		MusicTeacher c3=new MusicTeacher();
		System.out.println(c3.MT2+c3.collegename);
}
  
}