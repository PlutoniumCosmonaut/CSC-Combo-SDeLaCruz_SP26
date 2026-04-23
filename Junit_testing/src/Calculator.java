
public class Calculator {

	public int multiply(int a, int b) {
		return a * b;
	}

	public int add(int a, int b) {
		return a + b;
	}

	public double divide(double a, double b) {
		if (b == 0) {
			throw new IllegalArgumentException("Dividing by zero? are you crazy?");
		}
		return a / b;
	}

}
