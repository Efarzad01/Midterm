package design;

import org.testng.Assert;

public class UnitTestingEmployeeInfo {
    public static void main(String[] args) {
        //Write Unit Test for all the methods has been implemented in this package.
        EmployeeInfo empl00 = new EmployeeInfo();
        empl00.getemp("Saad");
        empl00.calculateSalary();
        Assert.assertEquals(10,empl00.deptId);
        Assert.assertEquals(4,empl00.employeeName());
        Assert.assertEquals(70,empl00.calculateSalary());
    }
}
