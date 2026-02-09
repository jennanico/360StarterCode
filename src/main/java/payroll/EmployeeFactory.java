package payroll;

public class EmployeeFactory {

	public EmployeeFactory() {
		super();
	}

	public Employee createEmployee(String fName, String lName, String workerType) {
		Employee myWorker = null;
		
		if (workerType == "CONTRACTOR") {
			myWorker = new ContractWorker(fName, lName);
		}
		else if (workerType == "HOURLY") {
			myWorker = new HourlyWorker(fName, lName);
		}
		else if (workerType == "SALARY") {
			myWorker = new SalaryWorker(fName, lName);
		}
		
		return myWorker;
		
	}

}
