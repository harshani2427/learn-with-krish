package PrototypeOwnClone_DeepCopy;

import java.util.Scanner;

public class StudentCloneDemo {

	public static void main(String[] args) {
		
		//get a registry obj
		Registry registry = new Registry();
		
		
		//get user input, create first user 
		System.out.println("Please create the first student and register");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Student ID:");
		int id = sc.nextInt();
		System.out.println("Student Name:");
		String name =sc.next();
		System.out.println("Student Age:");
		int age = sc.nextInt();
		
		//regiter the first instance of the student
		registry.Registration(id, name, age);
		
		//=====================================================================================
		
		Student s1= registry.getStudentClone();   //--->873415566
		System.out.println(s1);
		
		Student s2= registry.getStudentClone();   //--->818403870   (different adderesses)
		System.out.println(s2);
		
		s2.setAge(25);
		
		System.out.println("\n\nAfter changing the value of age 0f S2");
		System.out.println(s1);
		System.out.println(s2);
		
		
		//output
//		Please create the first student and register
//		Student ID:
//		1
//		Student Name:
//		harshani
//		Student Age:
//		56
//		Student [id=1, name=harshani, age=56, hashCode()=873415566]
//		Student [id=1, name=harshani, age=56, hashCode()=818403870]
//
//
//		After changing the value of age 0f S2
//		Student [id=1, name=harshani, age=56, hashCode()=873415566]
//		Student [id=1, name=harshani, age=25, hashCode()=818403870]
	}

}
