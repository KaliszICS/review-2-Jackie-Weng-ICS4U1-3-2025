import java.util.Scanner;
public class PracticeProblem {


	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
	}

	public static void q1() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("In: ");
		String inputString = scanner.nextLine();
		System.out.println(inputString);
	}

	public static void q2() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("In: ");
		int dividend = scanner.nextInt();
		System.out.print("In: ");
		int divisor = scanner.nextInt();

		int quotient = dividend / divisor; 
		int remainder = dividend % divisor;
		System.out.println(quotient);
		System.out.println(remainder);
	}

	public static void q3() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("In: ");
		String inputString = scanner.nextLine();
		System.out.println(inputString + " was the text you wrote");
		
	}

	public static void q4() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("In: ");
		int number = scanner.nextInt();
		int fold5 = number * 5;
		System.out.println(fold5);
		
	}

	public static void q5() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("In: ");
		boolean inputBool = scanner.nextBoolean();
		System.out.println(inputBool + " is a boolean");
	}

	public static void q6() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("In: ");
		double input = scanner.nextDouble();
		System.out.println(input - 3.2);

	}

}
