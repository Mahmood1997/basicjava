package basicjava;

public class Overload {

	public static void main(String[] args) {
		System.out.println(Add(1, 50));
		System.out.println(Add(5.354, 40.25));
		System.out.println(Add("Java", "Selenium"));
	}
		public static int Add(int a, int b){
			return (a+b);
		}
		public static double Add(double a, double b){
			return (a+b);
		}
		public static String Add(String a, String b){
			return(a+b);
		}
	

}
