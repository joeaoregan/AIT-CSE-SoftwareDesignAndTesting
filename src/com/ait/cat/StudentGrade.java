/*
 * Joe O'Regan
 * A00258304
 * 24/07/2018
 * 
 * Software Design & Testing
 * Testing - JUnit Lab 1
 */
package com.ait.cat;

public class StudentGrade {
	char grade = 'F';

	public char convertToGrade(int mark) {
		if (mark >= 85) {
			grade = 'A';
		} else if (mark >= 70 && mark < 85) {
			grade = 'B';
		} else if (mark >= 55 && mark < 70) {
			grade = 'C';
		} else if (mark >= 40 && mark < 55) {
			grade = 'D';
		} else if (mark >= 25 && mark < 40) {
			grade = 'E';
		} else if (mark < 25)
			grade = 'F';

		return grade;
	}
}
