import java.util.Scanner;

public class ServiceImpl implements Service {

	private double a, b;
	private static Scanner scan = new Scanner(System.in);
	@Override
	public double addition() {
		System.out.println("Enter First No.");
		a=scan.nextDouble();
		System.out.println("Enter First No.");
		b=scan.nextDouble();
		return (a+b);
	}




	

}
