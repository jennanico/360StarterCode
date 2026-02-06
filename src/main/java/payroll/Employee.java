package payroll;

abstract class Employee {
	
	String firstName;
	String lastName;
	int hoursWorked;
	
	// To be overriden by child classes
	abstract int calcPay(int hours);
	
	abstract void setHours();
	
}
