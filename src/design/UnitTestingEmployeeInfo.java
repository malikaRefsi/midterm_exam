package design;

import org.junit.Assert;

public class UnitTestingEmployeeInfo {
    public static void main(String[] args) {
        //Write Unit Test for all the methods has been implemented in this package.
        EmployeeInfo employeeInfo=new EmployeeInfo();
        //Apply the test to check the calculateEmployeeBonus method case scenario where an employee in the company for 23 years and get payed 2000 the bonus is
        double expectedResult=4600.0;
        employeeInfo.setSalary(2000);
        double actualResult=employeeInfo.calculateEmployeeBonus(23);

        try {
            Assert.assertEquals(actualResult, expectedResult,10000.00);
        }catch(Exception ex){
            ex.getMessage();
        }

       //Apply the test to check the one of the setter and getter method for instance if I set nameCompany to Guchi
        employeeInfo.setCompanyName("Guchi");
        String expectedResult4="Guchi";
        String actualResult4= employeeInfo.getCompanyName();
        try {
        Assert.assertEquals(actualResult4, expectedResult4);
        }catch(Exception ex){
            ex.getMessage();
        }


//        //Apply the test to check the calculateEmployeePension() method case scenario where an employee in the company worked between: May,2015 and August,2017
//        double expectedResult2=4600.0;
//        employeeInfo.setSalary(2000);
//        double actualResult2=employeeInfo.calculateEmployeePension();
//        System.out.println(actualResult2);
//        Assert.assertEquals(actualResult, expectedResult,0.1);


    }
}
