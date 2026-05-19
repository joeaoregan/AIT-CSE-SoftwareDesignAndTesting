## Unit Testing Employee Recording System

Time Allowed: 2.5 hrs

Upload to moodle a .zip file of your eclipse project and this word document with the screenshots included. Please use the snipping tool to paste in screenshots from eclipse. If you paste the code as text msword may autocorrect. NB Make sure you upload the correct files. 

**N.B.Name your test methods as specified in this document.**

**Notes on Marking Scheme**

1.	Your production code and your test code must compile.
2.	You test should be passing (green bar) before it will be marked. No marks for partially completed/failing tests or for partially completed code or code with compilation errors.
3.	Implement the tests one by one as specified in this document.

```
+-----------------------------------------------------------------------+
|                             + EmployeeSys                             |
+-----------------------------------------------------------------------+
| -userLoggedIn : Boolean                                               |
| -password : String                                                    |              ________________________
| -username : String                                                    |             | getter and setters for |
+-----------------------------------------------------------------------+             | User and Employee      |
| +login(username : String, password : String) : Boolean                |             |________________________|
| +logOut()                                                             |
| +getNumberOfEmployees() : Integer                                     |               +---------------------+
| +addEmployee(employee : Employee) : Boolean                           |               |      + Employee     |
| +changePassword(oldPassword : String, newPassword : String) : Boolean |               +---------------------+
+-----------------------------------------------------------------------+               | -ppsNumber : String |
                                                            |                           | -name : String      |
                                                            | 1                    0..* | -age : Integer      |
                                                            +-------------------------->+---------------------+
                                                                                        |                     |
                                                                                        +---------------------+
```

An Employee Record System maintains information on company employees. To access features of the system, an authorised user must be logged in with their user name and password. Assume that only one user of the system.

The Employee System will implement the following User Stories

1.	As a user, I want to be able to login so that unauthorised changes to the system are avoided.
2.	As a user I want to be able to add an employee to the system so that details can be added when a new employee joins the company
3.	As a user, I want to be able to logout so that the security of the system is not compromised.
4.	As a user I want to be able to change my password so that the security of the system is not compromised.

### Step 1

First write a unit test class EmployeeTest for the Employee class that tests the constructor and the getters and setters. Write a unit test class UserTest 

1. Starting the project – Create a separate folder for your test code.

```
▾ 📁 EmployeeRecords
  ▾ 📂 src
    ▾ 📦 com.ait.employees
  ▾ 📂 test
    ▾ 📦 com.ait.employeestest
```

2. Make a package called com.ait.empoyees in the src folder and in the test folder. Add a class called Employee to the src and a junit class called EmployeeTest to the tests folder. Test the constructor and the getters and setters.

```
▾ 📁 EmployeeRecords
  ▾ 📂 src
    ▾ 📦 com.ait.employees
  ▾ 📂 test
    ▾ 📦 com.ait.employees
```

### Step 2

Now we will test the EmployeeSys functionality - 

#### User Story 1

As a user, I want to be able to login so that unauthorised changes to the system are avoided.

In the class EmployeeSys, the variables username and password are given default values of “root” and “admin”. Create an instance of the EmployeeSys and test that the login method returns true when “root” and “admin” are passed in the “login” method

Test 1-1 (**testValidUserLogin**) Valid login - Test that true is returned (assertTrue) when username and password are correct

Test 1-2 (**testUserLoginInvalidUserName**) Invalid login Test that false is returned when the username is incorrect (it doesn’t matter what value is used for password).

Test 1-3 (**testUserLoginInvalidPassword**) Invalid login Test that false is returned when the username is correct but incorrect password

### Step 3

#### User Story 2 

As a user I want to be able to add an employee to the system so that details can be added when a new employee joins the company.

It is not necessary for a user to be logged in to find the number of employees.

Test 2-1 (**testNoEmployeesInSystem**) There should be no employees in the system before any are added. Use the `getNumberOFEmployees` method.

Test 2-2 (**testOneEmployeesInSystem**) User logins and adds an employee to the system. There should be one employee in the system now. The user must be logged in (variable `userLoggedIn` keeps track of login status – it is set to true if the user is logged in). The user must be logged in in order for an employee to be added.

Test -2-3 (**testAddEmployeeUserNotLoggedIn**) Try to add an employee if the user hasn’t logged in. Employee not added. Test that number of employees hasn’t changed.

Test -2-4 (**testTwoEmployeesInSystem**) User logs in and add two employees to the system. Test that there are two employees in the system

#### User Story 3

As a user, I want to be able to logout so that another user can use the system

T3-1 (**testUserLogOut**) User logs in and adds an employee to the system. Employee logs out. Try to add another employee to the system. `addEmployee` method should return “false”.

#### User Story 4

As a user I want to be able to change my password so that the security of the system is not compromised.

T4-1 (**testChangePasswordSuccess**) User changes their password. Check that user can log in with new password and that the user can add an Employee

T4-2 (**testChangePasswordUnSuccess**) User specifies incorrect old password when attempting to change the password. Test that `changePassword` returns false when oldPassword is incorrect

---

[EmployeeSys.java](https://github.com/joeaoregan/AIT-CSE-SoftwareDesignAndTesting/blob/master/src/ait/sdt/wk6/EmployeeSys.java)  
[Employee.java](https://github.com/joeaoregan/AIT-CSE-SoftwareDesignAndTesting/blob/master/src/ait/sdt/wk6/Employee.java)  
[EmployeeTest.java](https://github.com/joeaoregan/AIT-CSE-SoftwareDesignAndTesting/blob/master/Test/ait/sdt/wk6/EmployeeTest.java)