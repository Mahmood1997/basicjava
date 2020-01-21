package basicjava;
//Independent class
public class Polymorp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PolyBank bank_2 = new PolyBank_2();
		PolyBank bank_3 = new PolyBank_3();
		
		System.out.println(bank_2.interestrate());
		System.out.println(bank_3.interestrate());
	}

}
