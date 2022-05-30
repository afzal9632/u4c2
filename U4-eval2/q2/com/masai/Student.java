package com.masai;

public class Student {
	
	private int roll;
	private String name;
	private String address;
	private int marks;
	
	public void Student()
	{};
	

	public void Student(int roll, String name, String address, int marks) {
		
		this.roll = roll;
		this.name = name;
		this.address = address;
		this.marks = marks;
	}

	public int getRoll() {
		return roll;
	}



	public void setRoll(int roll) {
		roll = this.roll;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getAdress() {
		return adress;
	}



	public void setAdress(String address) {
		this.address = address;
	}



	public int getMarks() {
		return marks;
	}



	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	public void printDetails()
	{
		System.out.println("Roll is: ");
	}


	public static void main(String[] args) {
		

	}

}
