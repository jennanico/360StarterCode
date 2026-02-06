package payroll;

public class SalaryWorker extends Employee {

	protected SalaryWorker(String fName, String lName) {
		super(fName, lName);
	}

	@Override
	int calcPay() {
		return 40 * 10;
	}

}
