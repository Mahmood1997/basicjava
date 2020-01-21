package com.prosmart.actionitems.dec31;

public class Client {
//intitalize private variables into the global scope 
		private String firstN;
		private String lastN;
		private long CCN;
		private int exp;
		private int scode;
	//set the local scopes to their respective global scopes
	public Client(String firstN, String lastN, long CCN, int exp, int scode)
	{
		this.firstN = firstN;
		this.lastN = lastN;
		this.CCN = CCN;
		this.exp = exp;
		this.scode = scode;
	}
	
	//use the getter setter methods
	
	
	public String getFirstN() {
		return firstN;
	}




	public void setFirstN(String firstN) {
		this.firstN = firstN;
	}




	public String getLastN() {
		return lastN;
	}




	public void setLastN(String lastN) {
		this.lastN = lastN;
	}




	public long getCCN() {
		return CCN;
	}




	public void setCCN(long cCN) {
		CCN = cCN;
	}




	public int getExp() {
		return exp;
	}




	public void setExp(int exp) {
		this.exp = exp;
	}




	public int getScode() {
		return scode;
	}




	public void setScode(int scode) {
		this.scode = scode;
	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//this is where intialize variables to the argument placed above for the client
		//so setting them with the according parameters
		Client One = new Client("Mahmood","Khan", 277050074, 1213, 849);
		Client Two = new Client("Jack","Nicholsan",27863587,1119,535);
		//here im intializing variables to get the strings and integers listed to the above variables but individually
		String OFN = One.getFirstN();
		String OLN = One.getLastN();
		long OCN = One.getCCN();
		int OE = One.getExp();
		int OS = One.getScode();
		
		String TFN = Two.getFirstN();
		String TLN = Two.getLastN();
		long TCN = Two.getCCN();
		int TE = Two.getExp();
		int TS = Two.getScode();
		//here i jst set up how they were supposed to print according to the variables given
		System.out.println(OFN+" "+OLN+" your Credit Card number is: "+OCN+" Expires: "+OE+" Security code is: "+OS);
		System.out.println(TFN+" "+TLN+" your Credit Card number is: "+TCN+" Expires: "+TE+" Security code is: "+TS);
	}

}
