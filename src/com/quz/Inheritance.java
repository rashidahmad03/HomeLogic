package com.quz;

import java.util.Scanner;

class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;

	// Constructor
	Person(String firstName, String lastName, int identification) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}

	// Print person data
	public void printPerson() {
		System.out.println("Name: " + lastName + ", " + firstName + "\nID: " + idNumber);
	}

}

class Student extends Person {
	private int[] testScores;

	Student(String firstName2, String lastName, int id2, int[] testScores2) {
		super(firstName2, lastName, id2);
		this.testScores = testScores2;
	}

	public String calculate() {
		int c = 0;
		// OptionalDouble c = Arrays.stream(testScores).average();
		for (int i = 0; i < testScores.length; i++) {
			c += testScores[i];
		}

		int d = c / testScores.length;
		String rt = "";
		if (d >= 90 && d <= 100) {

			rt = "O";

		}
		if (d >= 80 && d < 90) {

			rt = "E";

		}
		if (d >= 70 && d < 80) {

			rt = "A";

		}
		if (d >= 55 && d < 70) {

			rt = "P";

		}
		if (d >= 40 && d < 55) {

			rt = "D";

		}
		if (d < 40) {

			rt = "T";

		}
		return rt;

		// TODO Auto-generated method stub

	}

	/*
	 * Class Constructor
	 * 
	 * @param firstName - A string denoting the Person's first name.
	 * 
	 * @param lastName - A string denoting the Person's last name.
	 * 
	 * @param id - An integer denoting the Person's ID number.
	 * 
	 * @param scores - An array of integers denoting the Person's test scores.
	 */
	// Write your constructor here

	/*
	 * Method Name: calculate
	 * 
	 * @return A character denoting the grade.
	 */
	// Write your method here
}

public class Inheritance {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for (int i = 0; i < numScores; i++) {
			testScores[i] = scan.nextInt();
		}
		scan.close();

		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate());
	}
}