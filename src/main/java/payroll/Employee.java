package payroll;

public class Employee {
	
	String firstName;
	String lastName;
	int hoursWorked;
	
	// To be overriden by child classes
	public int calcPay(int hours) {
		return 0;
	}

}
