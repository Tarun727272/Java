/*3. Write a Java program to divide two numbers and print them on the screen.
Test Data :
50/3
Expected Output :
16 */


// 01-Approach by programmer input
public class Dividenumber {

	public static void main(String[] args) {
		int num1=50;
		int num2=3;
		
		int num3=num1/num2;//16
		
		System.out.println("Divide of two number is: "+num3);

	}

}

// Bu user input 
import java.util.Scanner;
public class Dividenumber {

	public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter first number :");
		int num1=scan.nextInt();
     System.out.println("Enter second number :");
		int num2=scan.nextInt();
		
		int num3=num1/num2;
		
		System.out.println("Divide of two number is: "+num3);

	}

}
