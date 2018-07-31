/*
 * Joe O'Regan
 * A00258304
 * 24/07/2018
 * 
 * Software Design & Testing
 * Testing - JUnit Lab 1
 */
package com.ait.wk5.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.ait.wk5.cat.StudentGrade;

class StudentGradeTest {

	@Test
	void testGradeA() {
		StudentGrade studentGrade = new StudentGrade();
		assertEquals('A', studentGrade.convertToGrade(86));
	}

	@Test
	void testGradeB() {
		StudentGrade studentGrade = new StudentGrade();
		assertEquals('B', studentGrade.convertToGrade(75));
	}

	@Test
	void testGradeC() {
		StudentGrade studentGrade = new StudentGrade();
		assertEquals('C', studentGrade.convertToGrade(60));
	}

	@Test
	void testGradeD() {
		StudentGrade studentGrade = new StudentGrade();
		assertEquals('D', studentGrade.convertToGrade(50));
	}

	@Test
	void testGradeE() {
		StudentGrade studentGrade = new StudentGrade();
		assertEquals('E', studentGrade.convertToGrade(30));
	}

	@Test
	void testGradeF() {
		StudentGrade studentGrade = new StudentGrade();
		assertEquals('F', studentGrade.convertToGrade(20));
	}

}
