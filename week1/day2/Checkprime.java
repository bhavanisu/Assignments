package week1.day2;

import java.util.Scanner;

public class Checkprime {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter a number:");
	        int num = scanner.nextInt();

	        // Closing the scanner
	        scanner.close();

	        // Checking if the number is prime
	        boolean isPrime = true;
	        if (num < 2) {
	            isPrime = false;
	        } else {
	            for (int i = 2; i <= num / 2; i++) {
	                if (num % i == 0) {
	                    isPrime = false;
	                    break;
	                }
	            }
	        }

	        // Displaying the result
	        if (isPrime) {
	            System.out.println(num + " is a prime number.");
	        } else {
	            System.out.println(num + " is not a prime number.");
	        }}
	}
