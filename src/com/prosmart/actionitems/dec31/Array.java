package com.prosmart.actionitems.dec31;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//declare the array first: (int[] array)
				//initialize the array and set it's size(array[]= new array[#ofvalues])
//				int[] num = new int[4];
//				//the actual array
//				num[0] = (3465);
//				name[1] = (2465);
//				names[2] = (53748);
//				names[3] = (235246);
//				//.length basically changes the for loop automatically as the 
//				//actual array gets smaller or larger 
//				
//				for (int i=0; i<names.length; i++){
//					System.out.println(names[i]);
//				}
//			intitializing different parameters in order to seperate them easily later
//			
			int [] Num1 = new int[]{1,2};
			int [] Num2 = new int[]{1,2,3};
			int [] Num3 = new int[]{1,2,3,4};
			int [] Num4 = new int[]{1,2,3,4,5};
			//helps print the String of integers lined in the array for each individual parameter
			System.out.println(Arrays.toString(getArray(Num1)));
			System.out.println(Arrays.toString(getArray(Num2)));
			System.out.println(Arrays.toString(getArray(Num3)));
			System.out.println(Arrays.toString(getArray(Num4)));
			
	}//creates a new static method which needs a return type but enables to transfer through the integers in the array listed above
	//get and then the name of the class where info is connected
	public static int[] getArray(int[] n){
//intitalizes n as the variable int where the array is accessed
		 int[] a;//a is the variable intialized to array itself
	        if (n.length %2 == 0) {
	            // if the array length is even then there are two middle numbers
	            a = new int[2];
	            a[0] = n[(n.length/2) - 1];
	            a[1] = n[n.length/2];

	        } 
	        	else {
	            // if the array length is odd then there is one middle number
	            a = new int[1];
	            a[0] = n[n.length/2];
	        	}//the return value for the method instated
	        return a;
	   }
		
}
		
		
		
		
		
	
