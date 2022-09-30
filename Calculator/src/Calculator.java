import java.util.Scanner;

public class Calculator extends MathOperations {
	private double a, b;

	Scanner sc = new Scanner(System.in);
	
		
	public double addition() {
		System.out.println("Enter the First Number:>");
		a= sc.nextDouble();
		System.out.println("Enter the Second Number:>");
		b= sc.nextDouble();
		return (a+b);
	}	
	
	public double subtraction() {
		System.out.println("Enter the First Number:>");
		a= sc.nextDouble();
		System.out.println("Enter the Second Number:>");
		b= sc.nextDouble();
		return (a-b);
	}
	public double multiplication() {
		System.out.println("Enter the First Number:>");
		a= sc.nextDouble();
		System.out.println("Enter the Second Number:>");
		b= sc.nextDouble();
		System.out.println("This is Child Class Method:>");
		return (a*b);
	}
	public double division() {
		System.out.println("Enter the First Number:>");
		a= sc.nextDouble();
		System.out.println("Enter the Second Number:>");
		b= sc.nextDouble();
		return (a/b);
	}	
	
	

	public static void main(String[] args) {
			
		Scanner input = new Scanner(System.in);
		System.out.println("1: Add");
		System.out.println("2: Minus");
		System.out.println("3: Multiply");
		System.out.println("4: Divide");
		
		System.out.println("Enter the number for required operation:>");
		ServiceImpl service = new ServiceImpl();
		Calculator calc = new Calculator();
		MathOperations math = new MathOperations();
		MathOperations math1 = new Calculator();
		int a = input.nextInt();
		
		double result =0;
		
		switch(a) {
		case 1:
			//Abstraction
			//Calling method from ServiceImpl class
			result= service.addition();
			
			break;
		case 2:
			result = calc.subtraction();			
			break;
		case 3:
			//PolyMorphism
			//Calling method from MathOperations class  - Super Class
			result = math.multiplication();
			//Calling method from Calling from  Calculator class - Sub Class
			//result = math1.multiplication();
			break;
		case 4:
			result = calc.division();
			break;
			
			default:
				System.out.println("Wrong Selection");
		
		}
		
		System.out.println("Result:> " + result);

	}

}
