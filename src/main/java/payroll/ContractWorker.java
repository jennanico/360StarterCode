package payroll;

public class ContractWorker extends Employee {

	protected ContractWorker(String fName, String lName) {
		super(fName, lName);
	}

	@Override
	int calcPay() {
		return hoursWorked * 10;
	}

}
