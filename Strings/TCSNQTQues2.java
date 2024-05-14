// Title: Prime Numbers with Prime Digit Sums

// Problem Statement:
// Write a Java program to find and display prime numbers within a specified range whose sum of digits is also a prime number.
// The program should prompt the user to enter a lower bound and an upper bound for the range of numbers to be considered. 
// Ensure that the inputs are within the range of 1 to 99, inclusive.

// Implementation Details:

// The program contains two static methods:
// isPrime(int num): Determines whether a given number is prime.
// sumOfDigitsIsPrime(int num): Checks if the sum of the digits of a number is prime.
// The main method prompts the user to input the lower and upper bounds.
// If the inputs are valid (within the range of 1 to 99), the program proceeds to find prime numbers within the specified range whose sum of digits is also prime.
// If the inputs are invalid, the program displays a message prompting the user to enter valid input.
// Within the specified range, the program iterates through each number and checks if it is prime and if the sum of its digits is prime.
// If both conditions are satisfied, the number is displayed as part of the output.


// Example:

// Enter lower bound: 10
// Enter upper bound: 50
// Output: 11 23 41 43 


// Explanation:

// For the given range [10, 50], the prime numbers with the prime sum of digits are: 11, 23, 41, and 43.
// 11: Prime and sum of digits (1 + 1) is 2, which is prime.
// 23: Prime and sum of digits (2 + 3) is 5, which is prime.
// 41: Prime and sum of digits (4 + 1) is 5, which is prime.
// 43: Prime and sum of digits (4 + 3) is 7, which is prime.

// Contraints: 

// 1<n<100


import java.util.*;

public class TCSNQTQues2{
	public static boolean isPrime(int num){
		if(num==1){
			return false;
		}
		else if(num==2){
			return true;
		}
		else if(num%2==0){
			return false;
		}
		else{
			for(int a=3; a<=(num/2); a++){
				if(num%a==0){
					return false;
				}
			}
		}
		return true;
	}

	public static boolean sumOfDigitsIsPrime(int num){
		int sum = 0;
		int a = num/10;
		int b = num%10;
		sum = a+b;
		if(!isPrime(sum)){
			return false;
		}
		return true;
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter lower bound: ");
		int lower = sc.nextInt();
		System.out.print("Enter upper bound: ");
		int upper = sc.nextInt();
		if(lower>0 && upper <100){
			System.out.print("Output: ");
			for(int num = lower; num<= upper; num++){
				if(isPrime(num) && sumOfDigitsIsPrime(num)){
					System.out.print(num + " ");
				}
			}
		}
		else{
			System.out.println("Enter valid input!!");
		}
		sc.close();

	}	
}
