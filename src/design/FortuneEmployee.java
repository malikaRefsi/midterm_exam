package design;

import databases.ConnectToSqlDB;

import java.time.Year;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class FortuneEmployee  {

	/**
	 * FortuneEmployee class has a main methods where you will be able to create Object from
	 * EmployeeInfo class to use fields and attributes.Demonstrate as many methods as possible 
	 * to use with proper business work flow.Think as a Software Architect, Product Designer and 
	 * as a Software Developer.(employee.info.system) package is given as an outline,you need to elaborate
	 * more to design an application that will meet for fortune 500 Employee Information
	 * Services.
	 *
	 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
	 *
	 **/


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

			//storing object in an array

		EmployeeInfo[] employeeInfo=new EmployeeInfo[500];
	for (int i=0;i<=1;i++){
		System.out.print("Enter employee name, please: ");
		String companyName=sc.nextLine();
		System.out.print("Enter employee Id, please: ");
		int employeeId=Integer.parseInt( sc.nextLine());
		System.out.print("Enter employee name, please: ");
		String name=sc.nextLine();
		System.out.print("Enter employee's department, please: ");
		String assignDepartment=sc.nextLine();
		System.out.print("Enter employee's age, please: ");
		int age=Integer.parseInt( sc.nextLine());
		System.out.print("Enter employee's salary, please: ");
		int salary=Integer.parseInt( sc.nextLine());
		System.out.print("Enter employee's worked hours, please: ");
		int workedHours=Integer.parseInt( sc.nextLine());
		System.out.print("Enter employee's Email, please: ");
		String email=sc.nextLine();
		System.out.print("Enter employee's phone number, please: ");
		String phoneNumber=sc.nextLine();
		System.out.print("Enter number of vacation days, please: ");
		int vacationDays=Integer.parseInt( sc.nextLine());
		System.out.print("Enter employee's gender, please: ");
		String gender=sc.nextLine();
		employeeInfo[0] =new EmployeeInfo(name,employeeId,  assignDepartment,age,salary,workedHours,
		email,phoneNumber,vacationDays,gender );



	}
		System.out.println("print out the each employee information");
		for (int i=0;i<=1;i++){
		System.out.println(employeeInfo[i]);
		}
		//to calculate the bonus for each employee
		for (int i=0;i<=1;i++){
			System.out.print("Enter how many the employee is working in the company, please: ");
			int numberOfYears=Integer.parseInt( sc.nextLine());
			System.out.print("Enter the employee performance, please: ");
			employeeInfo[i].setPerformance(Integer.parseInt( sc.nextLine()));
			System.out.println("the employee bonus is: "+employeeInfo[i].calculateEmployeeBonus(numberOfYears));
			System.out.println("the pension this employee will earn is: "+employeeInfo[i].calculateEmployeePension());


		}






		//store and retrieve employees info
//		ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
//		List<String> list = new ArrayList<String>();
//		try {
//			connectToSqlDB.insertDataFromArrayListToSqlTable(employeeInfo, "tbl_lowestNumber", "column_lowestNumber");
//			list = connectToSqlDB.readDataBase("tbl_lowestNumber", "column_lowestNumber");
//
//			connectToSqlDB.insertDataFromArrayToSqlTable(employeeInfo, "tbl_lowestNumber", "SortingNumbers");
//			list = connectToSqlDB.readDataBase("tbl_lowestNumber", "SortingNumbers");
//
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		System.out.println("Data is reading from the Table (tbl_lowestNumber) and displaying to the console");
//		for(String st:list){
//			System.out.println(st);
//		}
//



	}


}
