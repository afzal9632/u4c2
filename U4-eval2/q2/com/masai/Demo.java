package com.masai;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of Student");
		int n = sc.nextInt();
		
		Student[] s_arr = new Student[n]; 
		
		for(Student ele:s_arr)
		{
			System.out.println("Enter student's roll no:");
			int roll = sc.nextInt();
			
			System.out.println("Enter student's name:");
			String name = sc.next();
			
			System.out.println("Enter address");
			String address = sc.next();
			
			System.out.println("Enter marks");
			int marks = sc.nextInt();
			
			Student( roll, name, address,  marks);

	}
	}

}
