import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		
		char operator;
		BigDecimal number1, number2, result1 = BigDecimal.ZERO;
		
		Scanner input = new Scanner(System.in);
		input.useLocale(Locale.US);
		
		System.out.println("Choose an operator: +, -, *, / or %");
		operator = input.next().charAt(0);
		
		System.out.println("Enter first number: ");
		number1 = input.nextBigDecimal();
		
		System.out.println("Enter second number: ");
		number2 = input.nextBigDecimal();
		
		switch (operator) {
		
		case '+':
			result1 = Operation.sum(number1, number2);
			break;
			
		case '-':
			result1 = Operation.sub(number1, number2);
			break;
			
		case '*':
			result1 = Operation.mol(number1, number2);
			break;
			
		case '/':
			result1 = Operation.div(number1, number2);
			break;
			
		case '%':
			result1 = Operation.mod(number1, number2);
			break;
			
		default:
			System.out.println("Invalid operator!");
			
		}
		input.close();
		
		System.out.println("Result: "+number1.doubleValue() + " " + operator + " " + number2.doubleValue() + " = " + result1.doubleValue());
		
	}

}
