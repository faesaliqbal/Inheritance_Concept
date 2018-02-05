package package1;

public class Dog extends Animal{
	
	/*
	 * Inheritance is the process that enables one class to acquire the properties (methods and variables) of another.
	 */
	
	/*
	 * The class inheriting the properties of another is the subclass (also called derived class or child class).
	 * The class whose properties are inherited is the superclass (also called base class or parent class).
	 */
	
	/*
	 * Animal is the parent class
	 * Dog is the child class
	 */
	
	/*
	 * WHEN ONE CLASS IS INHERITED FROM ANOTHER CLASS, IT INHERITS ALL OF THE SUPERCLASS' NON-PRIVATE VARIABLES AND METHODS.
	 */
	
	//Constructor
	Dog(){
		legs = 4;
		System.out.println("Dog");
	}
	
	/*
	 * Dog will inherit following attributes and methods of Animal:
	 * legs attribute - because it is non-private attribute
	 * eat method - because it is non-private method
	 * 
	 * Dog will not inherit following attributes and methods of Animal:
	 * color attribute - because it is a private attribute
	 * Animal class constructors  - because constructors are not member methods, and so are not inherited by subclasses
	 * 
	 * HOWEVER, THE CONSTRUCTOR OF THE SUPERCLASS IS CALLED WHEN THE SUBCLASS IS INSTANTIATED.
	 */
	
	/*
	 * You can access the superclass from the subclass using the super keyword.
	 */
	public void run(){
		System.out.println("dog can run with "+super.legs+" legs.");
	}

}
