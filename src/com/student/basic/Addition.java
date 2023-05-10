package com.student.basic;
 import java.util.Scanner;

 
public class Addition {

	public static void main(String[] args)
	{
		int a = 0,b = 0,c = 0;
 Scanner sc = new Scanner(System.in);		
 
 System.out.println("Enter Two No:");
 a = sc.nextInt();
 b = sc.nextInt();
 c = a+b;
 System.out.println("Addition:"+c);
	}

}


