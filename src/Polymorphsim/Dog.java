package Polymorphsim;

public class Dog extends Animal {
	   void say()
	   {
		   System.out.println("I am Dog");
	   }
	   
	   public static void main(String[] args) {
		//Animal a= new Animal();
		 //  a.say();
		   
		Dog d= new Dog();
		   d.say();

	}

}
