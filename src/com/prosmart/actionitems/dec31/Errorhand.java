package com.prosmart.actionitems.dec31;

public class Errorhand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			
		
		//creates an array and catches any variable under the array set
		int[] myArr= new int[4];


			myArr[0]= 12;
			myArr[1]= 235;
			myArr[2]= 34;
			myArr[3]= 65;
			myArr[4]= 5;
			
			for(int x=0;x<myArr.length;x++){
				System.out.println(myArr[x]);
				
			}
		}
			catch(Exception o)
			{//if the array set is more than the value stated remaining values print as 0
				System.out.println("NOT ASSOCIATED please pick upto 5");
			}
			
		
	}
}



