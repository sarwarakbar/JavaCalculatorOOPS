import java.util.Scanner;

public class MathOperations {
	
	private double a, b;
	Scanner sc = new Scanner(System.in);
	
		protected double multiplication() {
		System.out.println("Enter the First Number:>");
		a= sc.nextDouble();
		System.out.println("Enter the Second Number:>");
		b= sc.nextDouble();
		System.out.println("This is Parent Class Method.");
		return (a*b);
	}
}
