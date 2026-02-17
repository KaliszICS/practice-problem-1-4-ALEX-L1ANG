/*
Lesson: Input
Author: Alex Liang
Date Created : Feb 17, 2026
Date Last Modified: Feb 17, 2026
*/

import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
	}

	public static void q1() {
		//Write question 1 code here
	String name;
	Scanner input = new Scanner(System.in);
	System.out.print("What is your name: ");
	name = input.nextLine();
	System.out.print(name);
	}

	public static void q2() {
		//Write question 2 code here
	int num;
	System.out.print("Input a whole number: ");
	num = input.nextInt();
	input.nextLine();
	System.out.println(num);
	}

	public static void q3() {
		//Write question 3 code here
	double radius;
	System.out.print("Input a radius: ");
	radius = input.nextDouble();
	input.nextLine();
	System.out.print(3.14 * radius * 2);
	}

	public static void q4() {
		//Write question 4 code here
	string firstName;
	string lastName;
	int age;

	System.out.print("Input a first name: ");
	firstName = input.nextLine();
	lastName = input.nextLine();
	age = input.nextInt();
	input.nextLine();
	System.out.print(firstName + " " + lastName + "-" );
	
	}

	public static void q5() {
		//Write question 5 code here
	}

}
