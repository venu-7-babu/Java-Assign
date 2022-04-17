package OOPs;

class Animal{
	void sound(){
		System.out.println("Animals makes sounds");
	}
}
class Horse extends Animal{
	void sound() {
		System.out.println("The horse makes : wee wee");
	}
}
class Cat extends Animal{
	void sound() {
		System.out.println("The Cat makes : Meow Meow");
	}
}

public class Inheritace2 {
	public static void main(String[] args) {
		Animal obj[]=new Animal[3];
		obj[0]=new Animal();
		obj[1]=new Horse();
		obj[2]=new Cat();
		
		for(int i=0 ; i < obj.length ;i++) {
			obj[i].sound();
		}
	}
}
