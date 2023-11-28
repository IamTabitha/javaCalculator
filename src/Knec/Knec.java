package Knec;
import java.util.Scanner;

class Calculator{
	public double num1 , num2;
	public String oper;
	public void addition(double num1, double num2) {
		double sum = num1 + num2;
		System.out.println(sum);	
	}
	public void subtraction(double num1, double num2) {
		double sum = num1 - num2;
		System.out.println(sum);	
	}
	public void multiplication(double num1, double num2) {
		double sum = num1 * num2;
		System.out.println(sum);	
	}
	public void division(double num1, double num2) {
		double sum = num1 / num2;
		System.out.println(sum);	
	}
}

public class Knec {

	public static void main(String[] args) {
		Calculator a = new Calculator();
		Scanner x = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		a.num1 = x.nextDouble();
		Scanner y = new Scanner(System.in);
		System.out.println("Enter the second number: ");
		a.num2 = y.nextDouble();
		Scanner z = new Scanner(System.in);
		System.out.println("Enter the operator (+,-,*,/) : ");
		a.oper = z.nextLine();
		switch(a.oper) {
		case "+":
			a.addition(a.num1, a.num2);
			break;
		case "-":
			a.subtraction(a.num1, a.num2);
			break;
		case "*":
			a.multiplication(a.num1,a.num2);
			break;
		case "/":
			a.division(a.num1, a.num2);
			break;
		default:
			System.out.println("Invalid operator!!!!");
		}
			
	}

}
