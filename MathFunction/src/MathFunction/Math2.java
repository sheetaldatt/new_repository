package MathFunction;

public class Math2 {

	//to perform the operations
	double add(double a, double b) {
	//Adding a and b
	double answer = a + b;
	return answer;
	}
	double subtract(double a, double b) {
	//subtracting a and b
	double answer = a - b;
	return answer;
	}
	double multiply(double a, double b) {
	//perform multiplication
	double answer = a * b;
	return answer;
	}
	double divide(double a, double b) {
	//perform division
	double answer = a / b;
	return answer;
	}
	double power(double a, double b) {
	double answer = a;
	for (int x = 2; x <= b; x++) {
	answer *= a;
	}
	return answer;
	}
	}