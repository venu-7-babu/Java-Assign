package OOPs;

class Base
{
	String name;

	
	Base()
	{
		System.out.println("parent class default constructor.");
		
	}

	
	Base(String name)
	{
		System.out.println("Parent class parametrized constructor");
	}
}

class Derived extends Base
{
	
	Derived()
	{
		super();
		System.out.println("Child class default constructor");
	}

	
	Derived(String name)
	{
		super("");
		System.out.println("Child class parametrized constructor");
	}

	
}

public class ConstructorChaining {
	public static void main(String args[])
	{
		Base obj = new Derived();
		Derived obj1 = new Derived("");
	}
}
