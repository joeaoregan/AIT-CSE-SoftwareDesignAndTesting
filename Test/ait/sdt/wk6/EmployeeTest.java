/*
 * Joe O'Regan
 * A00258304
 * 01/08/2018
 */
package ait.sdt.wk6;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmployeeTest {
	Employee employee;
	EmployeeSys employeeSys;

	@BeforeEach
	void setup() {
		employee = new Employee("A123", "Joe", 37);
		employeeSys = new EmployeeSys();
	}

	@Test
	void testGetPPSNumber() {
		assertEquals("A123", employee.getPpsNumber());
	}

	@Test
	void testSetPPSNumber() {
		assertEquals("A123", employee.getPpsNumber());
		employee.setPpsNumber("B456");
		assertEquals("B456", employee.getPpsNumber());
	}

	@Test
	void testGetName() {
		assertEquals("Joe", employee.getName());
	}

	@Test
	void testSetName() {
		assertEquals("Joe", employee.getName());
		employee.setName("Ademola");
		assertEquals("Ademola", employee.getName());
	}

	@Test
	void testGetAge() {
		assertEquals(37, employee.getAge());
	}

	@Test
	void testSetAge() {
		assertEquals(37, employee.getAge());
		employee.setAge(66);
		assertEquals(66, employee.getAge());
	}

	@Test
	void testLogin() {
		assertEquals(true, employeeSys.login("root", "admin"));
		assertEquals(false, employeeSys.login("root", "password"));
		assertEquals(false, employeeSys.login("user", "password"));
	}

	@Test
	void testValidUserLogin() {
		assertTrue(employeeSys.login("root", "admin"));
	}

	@Test
	void testUserLoginInvalidUserName() {
		assertFalse(employeeSys.login("invalid_username", "password"));
	}

	@Test
	void testUserLoginInvalidPassword() {
		assertFalse(employeeSys.login("root", "password"));
	}

	@Test
	void testNoEmployeesInSystem() {
		// System.out.println(Employee.getNumberOfEmployees());
		assertEquals(0, employeeSys.getNumberOfEmployees());
	}

	@Test
	void testOneEmployeeInSystem() {
		Employee employee = new Employee("a123", "Joe", 37);
		employeeSys.login("root", "admin");
		employeeSys.addEmployee(employee);
		assertEquals(1, employeeSys.getNumberOfEmployees());
	}

	@Test
	void testAddEmployeeUserNotLoggedIn() {
		assertFalse(employeeSys.addEmployee(employee));
	}

	@Test
	void testTwoEmployeesInSystem() {
		employeeSys.login("root", "admin");
		employeeSys.addEmployee(employee);
		Employee employee2 = new Employee("b234", "Ademola", 25);
		employeeSys.addEmployee(employee2);
		// System.out.println(employeeSys.getNumberOfEmployees());
		assertEquals(2, employeeSys.getNumberOfEmployees());
	}

	@Test
	void testUserLogOut() {
		employeeSys.login("root", "admin");
		employeeSys.addEmployee(new Employee("B234", "Ademola", 25));
		employeeSys.logOut();
		assertFalse(employeeSys.addEmployee(employee));
	}

	@Test
	void testChangePasswordSuccess() {
		assertTrue(employeeSys.changePassword("admin", "password"));
		assertTrue(employeeSys.login("root", "password"));
		assertTrue(employeeSys.addEmployee(employee));
	}

	@Test
	void testChangePasswordUnSuccess() {
		assertFalse(employeeSys.changePassword("oldPassword", "newPassword"));
	}
}
