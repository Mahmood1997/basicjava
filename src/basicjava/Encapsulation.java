package basicjava;
//Parent Class
public class Encapsulation {

	public static void main(String[] args) {
		Selenium obj = new Selenium();
		obj.setEmpName("Prosmart");
		obj.setAge(25);
		obj.setEmpSSN(123456789);
		System.out.println("Employee Name: " +obj.getEmpName());
		System.out.println("Employee Age: " +obj.getempAge());
		System.out.println("Employee SSN: " +obj.getEmpSSN());
	}
}
//Child/SubClass(Constructor)
	class Selenium{
		private int ssn;
		private String empName;
		private int empAge;
		//get methods
		public int getEmpSSN(){
			return ssn;
		}
		public String getEmpName(){
		return empName;
	}
	public int getempAge(){
		return empAge;
	}
	//set methods:
	public void setEmpName(String newValue){
		empName = newValue;
	}
	public void setAge(int newValue){
		empAge = newValue;
	}
	public void setEmpSSN(int newValue){
		ssn = newValue;
	} 

}
	
