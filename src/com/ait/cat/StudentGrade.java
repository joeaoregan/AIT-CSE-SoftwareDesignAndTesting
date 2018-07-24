/*
 * Joe O'Regan
 * A00258304
 * 24/07/2018
 * Software Design & Testing
 * Testing - JUnit
 */
package com.ait.cat;

public class StudentGrade {
	char grade = 'F';

	public char convertToGrade(int mark) {
		if (mark >= 85 && mark <= 100) {
			grade = 'A';
		} else if (mark >= 70 && mark < 85) {
			grade = 'B';
		} else if (mark >= 65 && mark < 70) {
			grade = 'C';
		} else if (mark >= 55 && mark < 65) {
			grade = 'D';
		} else if (mark >= 40 && mark < 55) {
			grade = 'E';
		}

		return grade;
	}
}
