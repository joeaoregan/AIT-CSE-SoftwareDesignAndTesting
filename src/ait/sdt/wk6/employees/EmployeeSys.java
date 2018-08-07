/*
 * Joe O'Regan
 * A00258304
 * 01/08/2018
 */
package ait.sdt.wk6.employees;

import java.util.ArrayList;

public class EmployeeSys {
	private Boolean userLoggedIn = false;
	private String password = "admin";
	private String username = "root";

	private static int numberOfEmployees;

	ArrayList<Employee> employeeList = new ArrayList<Employee>();

	public Boolean login(String username, String password) {
		if (username.equals(this.username) && password.equals(this.password)) {
			userLoggedIn = true;
			return userLoggedIn;
		}

		return false;
	}

	public void logOut() {
		userLoggedIn = false;
	}

	public int getNumberOfEmployees() {
		return employeeList.size();
	}

	public Boolean addEmployee(Employee employee) {
		if (userLoggedIn) {
			employeeList.add(employee);
			return true;
		}
		return false;
	}

	public Boolean changePassword(String oldPassword, String newPassword) {
		if (oldPassword.equals(this.password)) {
			this.password = newPassword;
			return true;
		}
		return false;
	}
}
