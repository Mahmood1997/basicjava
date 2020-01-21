package com.prosmart.actionitems.dec31;

public class Switch {

	public static void main(String[] args) {
	//i put the switch method in a for loop that way it prints the existing loop and only prints upto 15 tracks
		// TODO Auto-generated method stub
		for(int n=0; n<16; n++){
			//i set the print statement so its more clear at the end with the number of track preceeding the track name 
		System.out.println("Track: "+n);
		String Eminem; 
		{
			switch(n)
			{ 
		
			case 1: Eminem = "8 mile";
			break;
		
			case 2: Eminem = "lose yourself";
			break;
		
			case 3: Eminem = "not afraid";
			break;
		
			case 4: Eminem = "Superman";
			break;
		
			case 5: Eminem = "Stan";
			break;
		
			case 6: Eminem = "Monster";
			break;
		
			case 7: Eminem = "Sing For The Moment";
			break;
		
			case 8: Eminem = "My Name Is";
			break;
		
			case 9: Eminem = "My mom";
			break;
		
			case 10: Eminem = "mockingbird";
			break;
		
			case 11: Eminem = "The Real Slim Shady";
			break;
		
			case 12: Eminem = "Without Me";
			break;
		
			case 13: Eminem = "Purple pills";
			break;
		
			case 14: Eminem = "D12";
			break;
		
			case 15: Eminem = "Forgot About Dre";
			break;
		
			case 16: Eminem = "The Way I Am";
			break;
		
			case 17: Eminem = "Cleanin' out my closet";
			break;
		
			default: Eminem = "invalid";
			break;
		
			}
			
			
		
		}
System.out.println(Eminem);
	}




for(int x=0; x<20; x++){
	//this loop obviously entails to print upto 19 tracks where the invalid staement at the end comes to play since there is only 17 tracks 
	System.out.println("Track: "+x);
	String Eminem; 
	{
		switch(x)
		{ 
	
		case 1: Eminem = "8 mile";
		break;
	
		case 2: Eminem = "lose yourself";
		break;
	
		case 3: Eminem = "not afraid";
		break;
	
		case 4: Eminem = "Superman";
		break;
	
		case 5: Eminem = "Stan";
		break;
	
		case 6: Eminem = "Monster";
		break;
	
		case 7: Eminem = "Sing For The Moment";
		break;
	
		case 8: Eminem = "My Name Is";
		break;
	
		case 9: Eminem = "My mom";
		break;
	
		case 10: Eminem = "mockingbird";
		break;
	
		case 11: Eminem = "The Real Slim Shady";
		break;
	
		case 12: Eminem = "Without Me";
		break;
	
		case 13: Eminem = "Purple pills";
		break;
	
		case 14: Eminem = "D12";
		break;
	
		case 15: Eminem = "Forgot About Dre";
		break;
	
		case 16: Eminem = "The Way I Am";
		break;
	
		case 17: Eminem = "Cleanin' out my closet";
		break;
	//the default statement reiterated to values not presented in the switch case such as track 18 and 19 will say invalid since they dont exist here
		default: Eminem = "invalid";
		break;
	
			}
		
		}
		System.out.println(Eminem);
		}	

	}	
	
}
