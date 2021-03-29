package HW002;

import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the first number ...");
		int firstNumber = scanner.nextInt();

		System.out.println("Enter the second number ...");
		int secondNumber = scanner.nextInt();

		System.out.println("Select an operation number and enter that number...\r\n" + "1 - \"+\" addition;\r\n"
				+ "2 - \"-\" subtraction;\r\n" + "3 - \"/\" integer division;\r\n"
				+ "4 - \"%\" division with a remainder.");

		int operation = scanner.nextInt();
		scanner.close();

		switch (operation) {
		case 1:
			System.out.println(firstNumber + secondNumber);
			break;
		case 2:
			System.out.println(firstNumber - secondNumber);
			break;
		case 3:
			System.out.println(firstNumber / secondNumber);
			break;
		case 4:
			System.out.println(firstNumber % secondNumber);
			break;

		}
	}
}
