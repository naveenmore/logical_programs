package com.multiLevelInheritance.java;

public class Student {
	public static void main(String[] args) {

		Department d1 = new Department();
		System.out.println("University Name:"+d1.universityName);
		System.out.println("College Name:"+d1.collegeName);
		System.out.println("Department Name:"+d1.departmentName);

		d1.conductFest();
		d1.providePlacements();
		d1.conductExams();
	}
}