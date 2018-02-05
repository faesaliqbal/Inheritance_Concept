package package1;

public class Animal {
	
	private String color;
	protected int legs;
	
	/*
	 * Constructors are not member methods, and so are not inherited by subclasses.
	 */
	
	//Constructor
	Animal(){
		System.out.println("Animal");
	}
	
	public void eat(){
		System.out.println("Animal eats");
	}

}
