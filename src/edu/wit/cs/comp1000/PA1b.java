package edu.wit.cs.comp1000;

import java.util.Scanner;

// TODO: document this class
public class PA1b {

	// TODO: document this function
	public static void main(String[] args) {
		// TODO: write your code here
		
		int yards = 0;
		int feet = 0;
		int inches = 0;
		int total = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number of inches;");
		inches = input.nextInt();
		total = (yards*36) + (feet*12)+(inches);
		System.out.print("The number of yards is 1");
		System.out.print("The number of feet is 1");
		System.out.print("The number of inches is"+total);
	}

}
