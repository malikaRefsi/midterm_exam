package design;

import java.util.Map;
import java.util.Scanner;
 class EmployeeInfo extends HourlyEmployee implements Employee{

	/*This class can be implemented from Employee interface then add additional methods in EmployeeInfo class.
 * Also, Employee interface can be implemented into an abstract class.So create an Abstract class
 * then inherit that abstract class into EmployeeInfo class.Once you done with designing EmployeeInfo class,
 * go to FortuneEmployee class to apply all the fields and attributes.
 * 
 * Important: YOU MUST USE the 
 * OOP(abstraction,Encapsulation, Inheritance and Polymorphism) concepts in every level possible.
 * Use all kind of keywords(super,this,static,final........)
 * Implement Nested class.
 * Use Exception Handling.
 *
 */

	/*
	 * declare few static and final fields and some non-static fields
	 *
	 */

	    

	private static int performance;
	private static int payRate;
	private String companyName;
	private int Id;
	private String name;
	private String departement;
	private int age;
	private int workedHours;
	private String email;
	private String gender;
	private String phoneNumber;
	private int vacationDays;
	private Map<String,Integer> EmployeeSchedule;
	private int salary;
	private String position;

	// generate getters and setters

	public void setPosition(String position) {
		this.position = position;
	}

	// generate getters and setters
	public  void setPerformance(int performance) {
		this.performance = performance;
	}

	public int getPerformance(int performance) {
		return performance;
	}


	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setId(int id) {
		Id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartement(String departement) {
		return departement;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setWorkedHours(int workedHours) {
		this.workedHours = workedHours;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public int getVacationDays() {
		return vacationDays;
	}

	public void setVacationDays(int vacationDays) {
		this.vacationDays = vacationDays;
	}

	public Map<String, Integer> getEmployeeSchedule() {
		return EmployeeSchedule;
	}

	public void setEmployeeSchedule(Map<String, Integer> employeeSchedule) {
		EmployeeSchedule = employeeSchedule;
	}

	/*
	 * You must implement the logic for below 2 methods and 
	 * following 2 methods are prototype as well for other methods need to be design,
	 * as you will come up with the new ideas.
	 */
	
	/*
	 * you must have multiple constructor.
	 * Must implement below constructor.
	 */
	public EmployeeInfo(){

	}

	public EmployeeInfo(int employeeId){
		this.Id=employeeId;

	}
    public EmployeeInfo(String name, int employeeId){
		this.Id=employeeId;
		this.name=name;
		
	}
	public EmployeeInfo(String name, int employeeId,String  assignDepartment){
		this.Id=employeeId;
		this.name=name;
		this.departement=assignDepartment;

	}
	public EmployeeInfo(String name, int employeeId,String  assignDepartment, int age, int salary,int workedHours,
	String email,String phoneNumber,int vacationDays,String gender ){
		this.Id=employeeId;
		this.name=name;
		this.departement=assignDepartment;
		this.age=age;
		this.salary=salary;
		this.workedHours=workedHours;
		this.email=email;
		this.phoneNumber=phoneNumber;
		this.vacationDays=vacationDays;
		this.email=gender;

	}

	@Override
	public String toString() {
		return "EmployeeInfo{" +
				"companyName='" + companyName + '\'' +
				", Id=" + Id +
				", name='" + name + '\'' +
				", departement='" + departement + '\'' +
				", age=" + age +
				", workedHours=" + workedHours +
				", email='" + email + '\'' +
				", gender='" + gender + '\'' +
				", phoneNumber='" + phoneNumber + '\'' +
				", vacationDays=" + vacationDays +
				", EmployeeSchedule=" + EmployeeSchedule +
				", salary=" + salary +
				'}';
	}

	 @Override
	 void discription() {

	 }

	 /*
	 * This methods should calculate Employee bonus based on salary and performance.
	 * Then it will return the total yearly bonus. So you need to implement the logic.
	 * Hints: 10% of the salary for best performance, 8% of the salary for average performance and so on.
	 * You can set arbitrary number for performance.
	 * So you probably need to send 2 arguments.
	 * 
	 */
	public  double calculateEmployeeBonus(int numberOfYearsWithCompany){

		double total=0;
		switch(performance){
			case 1:
				total=numberOfYearsWithCompany*salary*0.1;
			break;
			case 2: total=numberOfYearsWithCompany*salary*0.08;
			break;
			case 3: total=numberOfYearsWithCompany*salary*0.02;
			default:
				total = 0;
		}
		return total;
	}



	/*
	 * This methods should calculate Employee Pension based on salary and numbers of years with the company.
	 * Then it will return the total pension. So you need to implement the logic.
	 * Hints: pension will be 5% of the salary for 1 year, 10% for 2 years with the company and so on.
	 * 
	 */
	public double calculateEmployeePension(){
		double total=0;
		Scanner sc  = new Scanner(System.in);
		System.out.println("Please enter start date in format (example: May,2015): ");
		String joiningDate = sc.nextLine();
		System.out.println("Please enter today's date in format (example: August,2017): ");
		String todaysDate = sc.nextLine();
        String convertedJoiningDate = DateConversion.convertDate(joiningDate);
        String convertedTodaysDate = DateConversion.convertDate(todaysDate);
		String ar1[]=   convertedJoiningDate.split("/");
		String ar2[]=  convertedJoiningDate.split("/");
		int numberOfYears=0;

		numberOfYears=(numberOfYears+(Math.abs(Integer.parseInt(ar1[0])-Integer.parseInt(ar1[0])))/12)+Math.abs(Integer.parseInt(ar1[1])-Integer.parseInt(ar1[1]));
		for (int j=0;j<numberOfYears;j++){
			total=total+salary*j*0.05;
		}

        //implement numbers of year from above two dates
		//Calculate pension

		return total;
	}
//create an inner class
	public static class EmployeeAddress {
		String address, apt,city, state, zipCode;

		public void Address(String city, String state, String address,String zipCode) {
			this.address = address;
			this.city = city;
			this.state = state;
			this.zipCode = zipCode;

		}

		@Override
		public String toString() {
		return "EmployeeAddress{" +
				"address='" + address + '\'' +
				", apt='" + apt + '\'' +
				", city='" + city + '\'' +
				", state='" + state + '\'' +
				", zipCode='" + zipCode + '\'' +
				'}';
		}
	}

	@Override
	public int employeeId() {
		return this.salary;
	}

	@Override
	public String employeeName() {
		return this.name;
	}

	 @Override
	 public void assignDepartment() {
		 System.out.println("the assigned departement is ");
	 }

	 @Override
	 public int calculateSalary() {
		 return this.salary;
	 }

	 @Override
	public void benefitLayout() {
		System.out.println("the employees will get 10% of the salary for best performance, " +
				"8% of the salary for average performance, and 2% for those withe low performance. ");
	}

	@Override
	public int workedHours() {
		return this.workedHours;
	}

	@Override
	public String EmployeeEmail() {
		return this.email;
	}

	@Override
	public String EmployeeGender() {
		return this.gender;
	}



	@Override
	public String EmployeePhoneNumber() {
		return this.phoneNumber;
	}

	@Override
	public Map<String, Integer> EmployeeSchedule() {
		return this.EmployeeSchedule;
	}

	@Override
	public int vacationDays() {
		return this.vacationDays;
	}


	@Override
	public String position() {
		return this.position;
	}


	private static class DateConversion {

		public DateConversion(Months months){}
		public static String convertDate(String date) {
			String [] extractMonth = date.split(",");
			String givenMonth = extractMonth[0];
			int monthDate = whichMonth(givenMonth);
			String actualDate = monthDate + "/" + extractMonth[1];
			return actualDate;
		}

		public static int whichMonth(String givenMonth) {
			Months months= Months.valueOf(givenMonth);
			int date = 0;
			switch (months) {
				case January:
					date = 1;
					break;
				case February:
					date = 2;
					break;
				case March:
					date = 3;
					break;
				case April:
					date = 4;
					break;
				case May:
					date = 5;
					break;
				case June:
					date = 6;
					break;
				case July:
					date = 1;
					break;
				case August:
					date = 1;
					break;
				case September:
					date = 1;
					break;
				case October:
					date = 1;
					break;
				case November:
					date = 1;
					break;
				case December:
					date = 1;
					break;
				default:
					date = 0;
					break;
			}
			return date;

		}
	}


}
     abstract class HourlyEmployee implements Employee {
		 private int payRate;
		 private int hoursWorked;
		 private double annualSalary;
		 private String payFrequency;

		 // no-argument constructor
		 // set the annualSalary
		 public void setAnnualSalary(double salary) {
			 annualSalary = salary;
		 }// end the setAnnualSalary

		 // get the annualSalary

		 public double getAnnualSalary() {

			 return annualSalary;
		 }// end the getAnnualSalary method

		 // set the payFrequency
		 public void setPayFrequency(String frequency) {
			 payFrequency = frequency;
		 }// end the setPayFrequency

		 // get the payFrequency
		 public String getPayFrequency() {

			 return payFrequency;
		 }//end the getPayFrequency


		 public HourlyEmployee() {

		 }// end no-argument constructor

		 // HourlyEmployee constructor with two arguments

		 public HourlyEmployee(int Rate, int Worked) {
			 setPayRate(Rate);
			 setHoursWorked(Worked);

		 }// end two argument HourlyEmployee constructor

		 // set the payRate
		 public void setPayRate(int Rate) {

			 payRate = Rate;
		 }// end setPayRate method

		 // get the payRate
		 public int getPayRate() {

			 return payRate;
		 }// end getPayRate method

		 // set the hoursWorked
		 public void setHoursWorked(int Worked) {

			 hoursWorked = Worked;
		 }// end the setHoursWorked method


		 // get the hoursWorked
		 public int getHoursWorked() {

			 return hoursWorked;
		 }// end the getHoursWorked method


		 // returns the state of HourlyEmployee Object
		 public String toString() {
			 String item = "";

			 item = item + "Annual Salary: " + payRate + "\n";
			 item = item + "Pay frequency: " + hoursWorked + "\n";
			 item = item + "Annual Salary: " + annualSalary + "\n";
			 item = item + "Pay frequency: " + payFrequency + "\n";
			 return item;
		 }// end method toString

		 public final void quitJob() {

			 System.out.println("Salaried Employee quiting the Job");
		 }


		 public final void acceptJob() {

			 System.out.println("Salaried Employee accepted the Job");

		 }

		 abstract void discription();
	 }


