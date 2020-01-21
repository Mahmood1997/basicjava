package basicjava;

class MethodOverride{
	void show()
	{
		System.out.println("Animal Show");
	}
}
//inherited class (Child and MethodOverride classes should be two seperate classes)
class Child extends MethodOverride{
	@Override
	void show()
	{
		System.out.println("Animal Child Show");
	}
}
	
//driver class
class Main{
	//Methodoverride is the name of the parent object,
	//then parent show() method is called
	public static void main(String[] args) {
		// a feature that allows a subclass or child class
		//to provide a specific implementation of a method
		//thats is already used in super/parent classes
			MethodOverride obj1 = new MethodOverride();
			Child obj2= new Child();
			obj1.show();
			//If the MethodOverride referencing to child object show()
			//is called. this is during the runtime of polymorphism
			obj2.show();
	}
}
	


