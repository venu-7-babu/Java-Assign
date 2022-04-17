
//This is another package
package OOPs.package1;

public class Demo {
	protected int x = 6;
}

//Acessing protected from outside the class
package OOPs;
import OOPs.package1.*;
public class ProtectedMethod extends Demo {
	public static void main(String[] args) {
		ProtectedMethod obj = new ProtectedMethod();
		System.out.println(obj.x);
	}
}
