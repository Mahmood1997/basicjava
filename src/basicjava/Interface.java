package basicjava;
interface Persons{
	public void subject();
	public void studentName();
}
	public class Interface implements Persons{

		// reference type in java which is similar to class it will
		//contain abstract methods. a class will be implemented an interface
		//interface person
		//public void subject();
		//public void studentname();
		public void subject()
		{
			System.out.println("This is math class");
		}
		public void studentName(){
			System.out.println("JOHN");
		}
		public static void main(String[] args){
		Interface e = new Interface();
		e.studentName();
		e.subject();
		}
	}
