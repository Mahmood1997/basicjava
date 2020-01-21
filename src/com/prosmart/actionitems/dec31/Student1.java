package com.prosmart.actionitems.dec31;
//basically follows parent class but has individualized values and enters data to the once empty fields
public class Student1 extends Prof_Khan {
	String Professor_name()
	{
	return "Prof. Monir";
	}
	
	String Student_name()
	{
		return "Redoy";
	}
	
	int GradYr()
	{
		return 2020;
	}
	
	double GPA()
	{
		return 4.0;
	}

//notice that the methods for the extensions are set as public but  not in the main static method
	//only the class pulling all the info will be set into the main static method
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
