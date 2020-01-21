package com.prosmart.actionitems.dec31;

public class Graduation {
//setting up the class to actually drive the inherited classes (parent:prof khan to sub classes: the students)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prof_Khan p1name = new Student1();
		Prof_Khan s1name = new Student1();
		Prof_Khan year1 = new Student1();
		Prof_Khan grade1 = new Student1();
		//basically sets variables for each individual data value
		System.out.printf(p1name.Professor_name()+"; ");
		System.out.println("Student: "+s1name.Student_name());
		System.out.println("Grad Year: "+year1.GradYr());
		System.out.println("GPA: "+grade1.GPA());
		//prints them out ina orderly fashion on different lines
		Prof_Khan p2name = new Student2();
		
		Prof_Khan s2name = new Student2();
		Prof_Khan year2 = new Student2();
		Prof_Khan grade2 = new Student2();
		//basically a copy and paste of the last one
		System.out.printf(p2name.Professor_name()+"; ");
		System.out.println("Student: "+s2name.Student_name());
		System.out.println("Grad Year: "+year2.GradYr());
		System.out.println("GPA: "+grade2.GPA());
		
		
		Prof_Khan p3name = new Student3();
		Prof_Khan s3name = new Student3();
		Prof_Khan year3 = new Student3();
		Prof_Khan grade3 = new Student3();
		
		System.out.printf(p3name.Professor_name()+"; ");
		System.out.println("Student: "+s3name.Student_name());
		System.out.println("Grad Year: "+year3.GradYr());
		System.out.println("GPA: "+grade3.GPA());
		
	}

}
