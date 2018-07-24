/*
 * Joe O'Regan
 * A00258304
 * 24/07/2018
 * Software Design & Testing
 */
package com.ait.cat;

public class StudentGrade {
	
	public char convertToGrade(int mark) {
		if (mark >= 85 && mark <= 100) {
			return 'A';			
		} else if (mark >= 70 && mark < 85) {
			return 'B';
		} else if (mark >= 65 && mark < 70) {
			return 'C';
		} else if (mark >= 55 && mark < 65) {
			return 'D';
		} else if (mark >= 40 && mark < 55) {
			return 'E';
		}
				
		return 'F';
	}
}
