package payroll;

abstract class Employee {
	
	String firstName;
	String lastName;
	public int hoursWorked;
	
	protected Employee(String fName, String lName) {
		firstName = fName;
		lastName = lName;
		hoursWorked = 0;
	}
	
	public void setHours(int hours) {
		if (hours >= 0) {
			this.hoursWorked = hours;
		}
	}
	
	// To be overriden by child classes.
	// Assuming hourly pay is 10/hr.
	abstract int calcPay();
	
	
}
