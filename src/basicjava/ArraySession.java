package basicjava;

public class ArraySession {

	public static void main(String[] args) {
		//Array: store multiple values under one single variable
		//limitation for built in function arrays: Sizing(arrayoutofboundsexcceptions) 
		//and type(the data type whether it falls under all integers, or all chars,
		//or all strings) issue
		//if you use dynamic array these limitations may be overcome.
		
		
		//declare the array first: (int[] array)
		//initialize the array and set it's size(array[]= new array[#ofvalues])
		int[] names = new int[4];
		//the actual array
		names[0] = (3465);
		names[1] = (2465);
		names[2] = (53748);
		names[3] = (235246);
		//.length basically changes the for loop automatically as the 
		//actual array gets smaller or larger 
		
		for (int i=0; i<names.length; i++){
			System.out.println(names[i]);
		}
	
	
	int [] Name = new int[4];
	Name[0] = 123;
	Name[1] = 356;
	Name[2] = 234;
	Name[3] = 456;
	
	for(int str : Name)
		{
		System.out.println(str);
		}



	}
}
	



