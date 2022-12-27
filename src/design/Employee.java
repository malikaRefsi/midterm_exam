package design;
import java.util.Map;
public interface Employee {
	
	/*Employee is an Interface which contains multiple unimplemented methods.Again few methods
	has been declared in below. you need to brainstorm to add more methods to meet the business requirements.
	*/
	//please read the following method and understand the business requirements of these following methods
	//and then implement these in a concrete class.
	
	//employeeId() will return employee id.
	public int employeeId();
	
	//employeeName() will return employee name
	public String employeeName();
	
	//assignDepartment() will assign employee to departments
    public void assignDepartment();
	
	//calculate employee salary
	public int calculateSalary();
	
	//employee benefit
	public void benefitLayout();
	// *********************************************added methods************************************************************


	// returns the worked hours
	public int workedHours();

	//returns the employee Email
	public String EmployeeEmail();

	//returns employee gender
	public String EmployeeGender();

	//returns employee address
	public String EmployeeAddress();

	//returns employee phone number
	public String EmployeePhoneNumber();

	//returns employee schedule as map each day and the assigned hours
	public Map<String,Integer> EmployeeSchedule();

	//returns how many days of the paid vacation
	public int vacationDays();

	// returns how many hours assigned to each employee
	public int assignedHours();

	//returns the position of each employee
	public String position();

	//returns the specialty of each employee
	public String specialty();
}
