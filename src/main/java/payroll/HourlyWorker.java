package payroll;

public class HourlyWorker extends Employee {

	protected HourlyWorker(String fName, String lName) {
		super(fName, lName);
	}

	@Override
	int calcPay() {
		if (hoursWorked > 40) {
			return 40 * 10 + (hoursWorked - 40) * 15;
		}
		else {
			return hoursWorked * 10;
		}
	}

}
