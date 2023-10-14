/*
WRITE A PROGRAM TO TAKE A EMPLOYEE INFORMATION AND DISPLAY(ENCAPSULATION)
*/

package lab1;

import java.util.Scanner;

class Employee{
	//instatnce variables
	int eid;
	String ename;
	float esalary;
	int age;
	
	void inputEmployee() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Name: ");
		ename=sc.nextLine();
		
		System.out.println("Enter Employee id:");
		eid=sc.nextInt();
		
		System.out.println("Enter the salary: ");
		esalary=sc.nextFloat();
		
		System.out.println("Enter the age:");
		age=sc.nextInt();
	}
	
	void displayEmployee() {
		System.out.println("Name of Employee: "+ename);
		System.out.println("Id of Emloyee: "+eid);
		System.out.println("Salary Of Employee: "+esalary);
		System.out.println("Age Of Employee: "+age);
	}
}

public class EmployeeEncapsulation {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp=new Employee();
		emp.inputEmployee();
		emp.displayEmployee();
		
	}

}
