package payroll;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmployeeTest {
	
	ContractWorker A;
	HourlyWorker B;
	SalaryWorker C;

	@BeforeEach
	void setUp() throws Exception {
		A = new ContractWorker("A", "AA");
		B = new HourlyWorker("B", "BB");
		C = new SalaryWorker("C", "CC");
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

}
