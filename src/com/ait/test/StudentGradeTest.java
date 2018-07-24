/*
 * Joe O'Regan
 * A00258304
 * 24/07/2018
 * Software Design & Testing
 */
package com.ait.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.ait.cat.StudentGrade;

class StudentGradeTest {

	@Test
	void testGradeA() {
		StudentGrade studentGrade = new StudentGrade();
		assertEquals('A', studentGrade.convertToGrade(86));
	}
	
	@Test
	void testGradeB() {
		StudentGrade studentGrade = new StudentGrade();
		assertEquals('B', studentGrade.convertToGrade(74));
	}

}
