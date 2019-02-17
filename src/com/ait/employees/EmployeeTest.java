package com.ait.employees;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class EmployeeTest {

	private Employee employee;
	@Before
	public void setUp() {
		employee=new Employee("5932F", "John", 20);
	}
	@Test
	public void testEmployeeConstructor() {
		assertEquals("5932F", employee.getPpsNumber());
		assertEquals("John", employee.getName());
		assertEquals(20, employee.getAge());
	}
	@Test
	public void testChangePpsNumber(){
		employee.setPpsNumber("1234G");
		assertEquals("1234G", employee.getPpsNumber());
	}
	@Test
	public void testChangeName(){
		employee.setName("Tom");
		assertEquals("Tom", employee.getName());
	}
	@Test
	public void testChangeAge(){
		employee.setAge(25);
		assertEquals(25, employee.getAge());
	}

}
