/* 5- Write a Java program that takes two numbers as input and displays the product of two numbers.
Test Data:
Input first number: 25
Input second number: 5
Expected Output :
25 x 5 = 125 */


import java.util.Scanner;

public class Product {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number : ");
		int num1=scan.nextInt();
		System.out.println("Enter first number : ");
		int num2=scan.nextInt();
		
		int num3=num1*num2;
		
		System.out.println("The product of two number is : "+num3);
	}

}
