/*6. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
Test Data:
Input first number: 125
Input second number: 24
Expected Output :
125 + 24 = 149
125 - 24 = 101
125 x 24 = 3000
125 / 24 = 5
125 mod 24 = 5 */

import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number : ");
		int num1=scan.nextInt();
		System.out.println("Enter second number : ");
		int num2=scan.nextInt();
		
		int sum=num1+num2;
		int sub=num1-num2;
		int mul=num1*num2;
		int div=num1/num2;
		int mod=num1%num2;
		
		System.out.println("The addition of two number : "+sum);
		System.out.println("The subtraction of two number : "+sub);
		System.out.println("The multiplication of two number : "+mul);
		System.out.println("The division of two number : "+div);
		System.out.println("The modulus of two number : "+mod);
	}

}
