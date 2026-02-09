package payroll;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmployeePayrollTest {
	
	ContractWorker A;
	HourlyWorker B;
	SalaryWorker C;
	
	Payroll payroll;
	
	EmployeeFactory factory;

	@BeforeEach
	void setUp() throws Exception {
		A = new ContractWorker("A", "AA");
		B = new HourlyWorker("B", "BB");
		C = new SalaryWorker("C", "CC");
		
		payroll = new Payroll();
		
		factory = new EmployeeFactory();
	}

	@Test
	void testName() {
		assertEquals("A", A.firstName);
		assertEquals("AA", A.lastName);
		
		assertEquals("B", B.firstName);
		assertEquals("BB", B.lastName);
		
		assertEquals("C", C.firstName);
		assertEquals("CC", C.lastName);
	}
	
	@Test
	void testSetHours() {
		assertEquals(0, A.hoursWorked);
		
		A.setHours(15);
		
		assertEquals(15, A.hoursWorked);
		
		A.setHours(-1);
		
		assertEquals(15, A.hoursWorked);
	}
	
	@Test
	void testCalcPay() {
		int pay;
		
		A.setHours(20);
		pay = A.calcPay();
		assertEquals(200, pay);
		
		A.setHours(45);
		pay = A.calcPay();
		assertEquals(450, pay);
		
		
		B.setHours(20);
		pay = B.calcPay();
		assertEquals(200, pay);
		
		B.setHours(45);
		pay = B.calcPay();
		assertEquals(475, pay);
		
		
		C.setHours(20);
		pay = C.calcPay();
		assertEquals(400, pay);
	}
	
	@Test
	void testCreateEmployee() {
		Employee newEmployee = factory.createEmployee("first", "last", "CONTRACTOR");
		
		assertEquals("first", newEmployee.firstName);
		assertEquals("last", newEmployee.lastName);
		assertTrue(newEmployee instanceof ContractWorker);
		
		Employee newEmployee2 = factory.createEmployee("first", "last", "SALARY");
		assertTrue(newEmployee2 instanceof SalaryWorker);
		
		Employee newEmployee3 = factory.createEmployee("first", "last", "HOURLY");
		assertTrue(newEmployee3 instanceof HourlyWorker);

		// Fail to add
		Employee failEmployee = factory.createEmployee("first", "last", "ABCD");
		assertNull(failEmployee);
		
	}
	
	
	@Test
	void testPayrollAdd() {
		payroll.addNewEmployee("first", "last", "CONTRACTOR");
		assertEquals(payroll.payroll.get(0).firstName, "first");
		assertEquals(payroll.payroll.get(0).lastName, "last");
		assertTrue(payroll.payroll.get(0) instanceof ContractWorker);
		
		payroll.addNewEmployee("first1", "last1", "SALARY");
		assertEquals(payroll.payroll.get(1).firstName, "first1");
		assertEquals(payroll.payroll.get(1).lastName, "last1");
		assertTrue(payroll.payroll.get(1) instanceof SalaryWorker);
		
		// Other method of adding
		Employee newEmployee = payroll.createEmployee("first2", "last2", "HOURLY");
		payroll.addNewEmployee(newEmployee);
		assertEquals(payroll.payroll.get(2).firstName, "first2");
		assertEquals(payroll.payroll.get(2).lastName, "last2");
		assertTrue(payroll.payroll.get(2) instanceof HourlyWorker);
		
		// Fail to add
		payroll.addNewEmployee("first2", "last2", "ABCD");
		assertEquals(3, payroll.payroll.size());
		
	}
	
	@Test
	void testPayrollSet() {
		payroll.setEmployeeHours(A, 15);
		assertEquals(15, A.hoursWorked);
		
		payroll.setEmployeeHours(A, -1);
		assertEquals(15, A.hoursWorked);
	}
	
	@Test
	void testPayrollPay() {
		payroll.setEmployeeHours(A, 40);
		payroll.setEmployeeHours(B, 45);
		payroll.setEmployeeHours(C, 40);
		
		payroll.addNewEmployee(A);
		payroll.addNewEmployee(B);
		payroll.addNewEmployee(C);
		
		int[] weeklyPay = payroll.payEmployees();
		assertEquals(3, weeklyPay.length);
		assertEquals(400, weeklyPay[0]);
		assertEquals(475, weeklyPay[1]);
		assertEquals(400, weeklyPay[2]);
	}

}
