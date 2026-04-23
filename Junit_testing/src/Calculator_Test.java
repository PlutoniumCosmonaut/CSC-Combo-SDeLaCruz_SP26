import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class Calculator_Test {

	private Calculator calculator;

	@BeforeEach
	void setUp() throws Exception {
		calculator = new Calculator();
	}

	@Test
	@DisplayName("Addition Tester")
	void testAdd() {
		int result = calculator.add(5, 3);
		assertEquals(result, 8, "\n~Add not working properly~\n");
	}

	@Test
	@DisplayName("Multiplication Tester")
	void MultiplicationTest() {
		int result = calculator.multiply(2, 3);
		assertEquals(result, 6, "\n~Multiply not working properly~\n");
	}
}
