// Write a program to convert rupees to dollar.70 rupees=1 dollar

import java.util.Scanner;

public class Rupeestodoller {

	public static void main(String[] args) {

		float rupees;

		Scanner in = new Scanner(System.in);

		System.out.println("Please enter rupees:");

		rupees = in.nextLong();

		float dollars = rupees / 70;

		System.out.println(dollars + " Dollars");
	}
}