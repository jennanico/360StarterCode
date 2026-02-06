package payroll;

import java.util.ArrayList;

public class Payroll extends EmployeeFactory {
	
	ArrayList<Employee> payroll;
	
	public Payroll() {
		super();
		this.payroll = new ArrayList<Employee>();
	}

	public void addNewEmployee(String fName, String lName, String workerType) {
		Employee newEmployee = createEmployee(fName, lName, workerType);
		payroll.add(newEmployee);
	}
	
	public void setEmployeeHours(Employee employee, int hours) {
		employee.setHours(hours);
	}
	
	public int[] payEmployees() {
		int[] weeklyPay = new int[payroll.size()];
		
		// Implementing later
		
		return weeklyPay;
	}

}
