package com.ait.employees;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class EmployeeSysTest {

	private EmployeeSys empSys;
	
	@Before
	public void setUp() {
		empSys=new EmployeeSys();
	}
	@Test
	public void testValidUserLogin() {
		assertTrue(empSys.login("root", "admin"));	
	}
	@Test
	public void testUserLoginInvalidUserName() {
		assertFalse(empSys.login("test", "admin"));	
	}
	@Test
	public void testUserLoginInvalidPassword() {
		assertFalse(empSys.login("root", "test"));	
	}
	
	@Test
	public void testNoEmployeesInSystem() {
		assertEquals(0, empSys.getNumberOfEmployees());	
	}
	
	@Test
	public void testOneEmployeesInSystem() {
		empSys.login("root", "admin");
		Employee employee=new Employee("5932F", "John", 20);
		empSys.addEmployee(employee);
		assertEquals(1, empSys.getNumberOfEmployees());	
	}
	@Test
	public void testAddEmployeeUserNotLoggedIn() {
		Employee employee=new Employee("5932F", "John", 20);
		empSys.addEmployee(employee);
		assertEquals(0, empSys.getNumberOfEmployees());	
	}
	@Test
	public void testTwoEmployeesInSystem() {
		empSys.login("root", "admin");
		Employee employee=new Employee("5932F", "John", 20);
		Employee otherEmployee=new Employee("2315R", "Joe", 30);
		empSys.addEmployee(employee);
		empSys.addEmployee(otherEmployee);
		assertEquals(2, empSys.getNumberOfEmployees());	
	}
	
	@Test
	public void testUserLogOut() {
		empSys.login("root", "admin");
		Employee employee=new Employee("5932F", "John", 20);
		empSys.addEmployee(employee);
		assertEquals(1, empSys.getNumberOfEmployees());	
		empSys.logOut();
		Employee otherEmployee=new Employee("2315R", "Joe", 30);
		assertFalse(empSys.addEmployee(otherEmployee));
		assertEquals(1, empSys.getNumberOfEmployees());	
	}
	
	@Test
	public void testchangePasswordSuccess() {
		empSys.changePassword("admin", "test");
		assertTrue(empSys.login("root", "test"));
		Employee employee=new Employee("5932F", "John", 20);
		empSys.addEmployee(employee);
		assertEquals(1, empSys.getNumberOfEmployees());	
		
	}
	
	@Test
	public void testchangePasswordUnSuccess() {
		empSys.changePassword("admin1", "test");
		assertFalse(empSys.login("root", "test"));
		Employee employee=new Employee("5932F", "John", 20);
		empSys.addEmployee(employee);
		assertEquals(0, empSys.getNumberOfEmployees());	
		
	}

}
