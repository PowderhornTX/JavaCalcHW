import java.util.Scanner;

public class JavaCalc {

	public static void main(String[] args) {

		int selection;
		int num1;
		int num2;
		
		boolean goAgain = true;
		
		Scanner input = new Scanner(System.in);
		
		while (goAgain) {

			System.out.print("\nPlease choose a calculator function.\n");
			System.out.println("(1: add; 2: subtract; 3: multiply; 4: divide; 5: square; 0: done)");
			selection = input.nextInt();
			System.out.println();
		
			switch (selection) {
				case 1:
					System.out.println("Enter the first number to add:");
					num1 = input.nextInt();
					System.out.println("Enter the second number to add:");
					num2 = input.nextInt();
					System.out.println("Result: " + add(num1, num2));
					break;
				case 2:
					System.out.println("Enter the number to subtract from:");
					num1 = input.nextInt();
					System.out.println("Enter the number to subtract:");
					num2 = input.nextInt();
					System.out.println("Result: " + subtract(num1, num2));
					break;
				case 3:
					System.out.println("Enter the first number to multiply:");
					num1 = input.nextInt();
					System.out.println("Enter the second number to multiply:");
					num2 = input.nextInt();
					System.out.println("Result: " + multiply(num1, num2));
					break;
				case 4:
					System.out.println("Enter the number to divide from:");
					num1 = input.nextInt();
					System.out.println("Enter the number to divide by:");
					num2 = input.nextInt();
					System.out.println("Result: " + divide(num1, num2));
					break;
				case 5:
					System.out.println("Enter the number to square:");
					num1 = input.nextInt();
					System.out.println("Result: " + square(num1));
					break;
				case 0:
					System.out.println("All done!");
					goAgain = false;
					return;
				default: 
					System.out.println("The selection was invalid. Please try again.");
			}
		}
	}
	
	public static int add(int num1, int num2) {
		return num1 + num2;
	}

	public static int subtract(int num1, int num2) {
		return num1 - num2;
	}
	
	public static int multiply(int num1, int num2) {
		return num1 * num2;
	}
	
	public static float divide(int num1, int num2) {
		return num1 / num2;
	}
	
	public static int square(int num1) {
		return (int)Math.pow(num1, 2);
	}
	
}
