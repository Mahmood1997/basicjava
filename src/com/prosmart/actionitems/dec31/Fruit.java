package com.prosmart.actionitems.dec31;

public class Fruit {
	//this is where i set the variables as private 
	private String name;
	private String color;
	private String taste;
	private int price;
	private double weight;
	

	public Fruit(String name, String color, String taste, int price, double weight) 
	{//setting up the local scopes with the respected global scope 
		this.name = name;
		this.color = color;
		this.taste = taste;
		this.price = price;
		this.weight = weight;
		
		// TODO Auto-generated constructor stub
	}
//generating the setter and getter methods

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public String getTaste() {
		return taste;
	}


	public void setTaste(String taste) {
		this.taste = taste;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public double getWeight() {
		return weight;
	}


	public void setWeight(double weight) {
		this.weight = weight;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
//intializing the varibles to the respected string 
		Fruit fruit1 = new Fruit("banana", "yellow", "sickly sweet", 2, 2.3);
		Fruit fruit2 = new Fruit("apple", "red", "crisp crunchy", 3, 4.3);
		Fruit fruit3 = new Fruit("orange", "orange", "tangy", 5, 5.2);
		//inatializing variables for each individual parameter set into the string intialized with the variable
		String f1name = fruit1.getName();
		String f1color = fruit1.getColor();
		String f1taste = fruit1.getTaste();
		double f1weight = fruit1.getWeight();
		int f1price = fruit1.getPrice();
		//prints all the individual parameters
		System.out.println(f1name);
		System.out.println(f1color);
		System.out.println(f1taste);
		System.out.println(f1weight);
		System.out.println(f1price);
		//prints all parameters in a smooth line
		System.out.println("Fruit: "+f1name+", color: "+f1color+", it tastes "+f1taste+", it weighs, "+f1weight+"lbs."+" and it costs $"+f1price+".");
		
		
		String f2name = fruit2.getName();
		String f2color = fruit2.getColor();
		String f2taste = fruit2.getTaste();
		double f2weight = fruit2.getWeight();
		int f2price = fruit2.getPrice();
		
		
		System.out.println(f2name);
		System.out.println(f2color);
		System.out.println(f2taste);
		System.out.println(f2weight);
		System.out.println(f2price);
		
		System.out.println("Fruit: "+f2name+", color: "+f2color+", it tastes "+f2taste+", it weighs, "+f2weight+"lbs."+" and it costs $"+f2price+".");
		String f3name = fruit3.getName();
		String f3color = fruit3.getColor();
		String f3taste = fruit3.getTaste();
		double f3weight = fruit3.getWeight();
		int f3price = fruit3.getPrice();
		
		System.out.println(f3name);
		System.out.println(f3color);
		System.out.println(f3taste);
		System.out.println(f3weight);
		System.out.println(f3price);
		
		System.out.println("Fruit: "+f3name+", color: "+f3color+", it tastes "+f3taste+", it weighs, "+f3weight+"lbs."+" and it costs $"+f3price+".");
		//
		//the next 2 is basically copying and pasting the first body and just changing the varibales to match for their respected parameters
	}

}
