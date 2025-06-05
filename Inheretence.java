package xyz;
class Animal{
	void eat() {
		System.out.println("eating");
		
	}
	void sleep() {
		System.out.println("sleeping");
	}
	void hunt() {
		System.out.println("hunting");
		
	}
}
class Cat extends Animal{
	void sound() {
		System.out.println("sounding");
	}
}
class Dog extends Animal{
	void hunt() {
		System.out.println("hunting");
	}
}

public class Inheretence {

	public static void main(String[] args) {
		Dog ob=new Dog();
		Cat ob1=new Cat();
		ob1.sound();
		ob.hunt();
		ob.sleep();
		ob.eat();
		ob.hunt();
		

	}

}
