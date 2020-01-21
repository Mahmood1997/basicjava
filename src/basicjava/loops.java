package basicjava;

public class loops {

	public static void main(String[] args) {
		// loops run the code multiple times until the condition is true, or met
		//for loops
		String my_Name = "Prosmart" ;
		System.out.println(my_Name);
		for (int i = 1; i <= 10; i++)
		//int is the counter, the <= sets a boundary, i++ how the value will be changing
		System.out.println(my_Name+" "+ i);
	
		int mysum = 100;
		for (int x = 1; x <= 10; x++){
		mysum = mysum+2;
		
	}
System.out.println(mysum);
//while loop
int l = 1; //initialization
while (l <= 10){
	System.out.println(my_Name+" "+l);
	l++;
}
}

}
