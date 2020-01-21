package com.prosmart.actionitems.dec31;

//import java.awt.List;
//import java.util.ArrayList;

public class Employee {
	
	private String name;
	private int ID;
	private String Position;
	private int Salary;
//set private type and variable then right click click source  and click getters and setters

	public Employee(String name, int ID, String Position, int Salary)
	{
		this.name = name;
		this.ID = ID;
		this.Position = Position;
		this.Salary = Salary;
		
	}
	
	
	public String getName(){
	
		return name;
	}

	public void setName(String name) {
		this.name = name;
		//this name sets it to above global prospect set above, referencing the global scope/variable(blue)
		//(brown) local scope set only into that method
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getPosition() {
		return Position;
	}

	public void setPosition(String position) {
		Position = position;
	}

	public int getSalary() {
		return Salary;
	}

	public void setSalary(int salary) {
		Salary = salary;
	}

	public static void main(String[] args) {
		// set it to a list that way it will reiterate it throughout the index 0 to whatever
		//List<Employee> listOfEmployees = new ArrayList<Employee>();
		
		
		Employee employeeOne = new Employee("jeff", 429, "CEO", 239858);
		Employee employeeTwo = new Employee("mo", 000, "Janitor", 8756);
		Employee employeeThree = new Employee("shumon", 235, "Intern", 8476);
		//. options are called intelligence/ code recommender and pick get mothods
		//salary1 is the salary of employee 1
		//
		String Name1 = employeeOne.getName();
		int Salary1 = employeeOne.getSalary();
		String Name2 = employeeTwo.getName();
		int Salary2 = employeeTwo.getSalary();
		String Name3 = employeeThree.getName();
		int Salary3 = employeeThree.getSalary();
		
		if (Salary1>= 15000){
			System.out.println(Name1+" Salary is: "+Salary1);
		}
		
		else if(Salary1<15000)
		{
			System.out.println(Name1+" salary is too low");
		}
		if(Salary2> 15000){
			System.out.println(Name2+" Salary is: "+Salary2);
		}
		
		else
		{
			System.out.println(Name2+" Salary is: Too low");
		}
		if (Salary3> 15000){
			System.out.println(Name3+" Salary is: "+Salary3);
		}
		
		else
		{
			System.out.println(Name3+" Salary is: Too low");
		}
		

		
	}

}
