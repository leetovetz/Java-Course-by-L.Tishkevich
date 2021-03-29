package HW002;

import java.util.Random;
import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
		Scanner inputFromCommandLine = new Scanner(System.in);

		System.out.println("Enter the size of the array:...");

		int massLength = inputFromCommandLine.nextInt();
		int[] mass = new int[massLength];

		Random random = new Random();

		for (int i = 0; i < mass.length; i++) {
			mass[i] = random.nextInt(30);
		}

		System.out.println("Enter the number to search for in the array...");

		int number = inputFromCommandLine.nextInt();
		
		inputFromCommandLine.close();
		
		for (int element : mass) {
			if (element == number) {
				System.out.println(element);
			}
		}

		int max = mass[0];

		for (int element : mass) {
			if (element > max) {
				max = element;
			}
		}
		System.out.println("Maximum value in the array = " + max);
	}
}
