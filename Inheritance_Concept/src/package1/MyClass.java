package package1;

public class MyClass {

	public static void main(String[] args) {
		//d object does not inherit color attribute of Animal class as it is private
		/*
		 * As per rule, constructor of the Animal class is called when the Dog class is instantiated.
		 */
		
		Dog d = new Dog(); //Animal constructor is called. And then Dog constructor is called.
		
		d.eat(); //output would be Animal eats
		d.run();

	}

}
