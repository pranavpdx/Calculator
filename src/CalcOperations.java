
public class CalcOperations {
	static String add(String firstNum, String secondNum) {
		int first = Integer.parseInt(firstNum);
		int second = Integer.parseInt(secondNum);
		int result = first + second;
		return Integer.toString(result);
	}
	
	static String subtract(String firstNum, String secondNum) {
		int first = Integer.parseInt(firstNum);
		int second = Integer.parseInt(secondNum);
		int result = first - second;
		return Integer.toString(result);
	}
	
	static String multiply(String firstNum, String secondNum) {
		int first = Integer.parseInt(firstNum);
		int second = Integer.parseInt(secondNum);
		int result = first * second;
		return Integer.toString(result);
	}
	
	static String divide(String firstNum, String secondNum) {
		int first = Integer.parseInt(firstNum);
		int second = Integer.parseInt(secondNum);
		int result = first / second;
		return Integer.toString(result);
	}
}
