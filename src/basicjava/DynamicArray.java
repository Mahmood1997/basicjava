package basicjava;

import java.util.ArrayList;

public class DynamicArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//arraylist is a function in java to establish a generic array
		//use the .add and set them all to object E first option
		ArrayList nam = new ArrayList();
		nam.add("Java");
		nam.add("Java");
		nam.add("Selenium");
		nam.add(23545);
		nam.add(true);
		//System.out.println(nam);
		//use the get method and pick the coninsiding index value for desired outcome 
		//System.out.println(nam.get(3));
		
		nam.remove(3);
		System.out.println(nam);
		
		
		
	}

}
