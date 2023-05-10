package com.student.basic;
import java.util.Scanner;
public class Studentinfo{
	Studentd s = new Studentd();
	Scanner sc = new Scanner(System.in);
	
	public void setStudentd() {
		System.out.println("Enter the Student Id");
		s.setId(sc.nextInt());
		System.out.println("Enter te Student Name");
		s.setName(sc.next());
		System.out.println("Enter the Student Fees");
		s.setFees(sc.nextDouble());
	}
	
	public void getStudentd() {
		System.out.println("Student Id:"+s.getId());
		System.out.println("Student Name:"+s.getName());
		System.out.println("Student Fees"+s.getFees());
	}
		
}



