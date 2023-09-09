/* 2. Write a Java program to print the sum of two numbers.
Test Data:
74 + 36
Expected Output :
110 */

// 01-Approach
public class Sumnumber {

	public static void main(String[] args) {
		int a=74;
		int b=36;
		int c=a+b; //110
		
		System.out.println("The sum of two number is : "+c);

	}

}

// 02-Approach

public class Sumnumber {

	public static void main(String[] args) {
		int a=74;
		int b=36;
//		int c=a+b;
		
		System.out.println("The sum of two number is : "+(a+b));//110

	}

}

// 03-Approach

import java.util.Scanner;
public class Sumnumber {

	public static void main(String[] args) {

Scanner scan=new Scanner(System.in);
		System.out.println("Enter first number : ");
		int num1=scan.nextInt();
		System.out.println("Enter second number : ");
		int num2=scan.nextInt();
		
		int num3=num1+num2;
		System.out.println("The sum of two number is : "+ num3);
		

	}

}
