package com.ait.employees;

import java.util.ArrayList;



public class EmployeeSys {

	private String username="root";
	private String password="admin";
	private ArrayList<Employee> employees=new ArrayList<Employee>();
	boolean userLoggedIn=false;

	public boolean login(String userName, String password) {
		if(this.username.equals(userName)&&this.password.equals(password)){
			userLoggedIn=true;
		}	
		return userLoggedIn;
	}
	
	public int getNumberOfEmployees(){
		return employees.size();
	}
	
	public boolean addEmployee(Employee employee){
		if (userLoggedIn){
			employees.add(employee);
			return true;
		}
		else{
			return false;
		}
	}
	public void logOut(){
		userLoggedIn=false;
	}
	public boolean changePassword(String oldPassword, String newPassword){
		if (oldPassword.equals(this.password)){
			this.password= newPassword;
			return true;
		}
		else{
			return false;
		}
	}
}
