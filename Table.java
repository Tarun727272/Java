/* Write a Java program that takes a number as input and prints its multiplication table up to 10.
Test Data:
Input a number: 8
Expected Output :
8 x 1 = 8
8 x 2 = 16
8 x 3 = 24
...
8 x 10 = 80 */
// 01--Without user input
public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tableNumber=8;
		System.out.println("Table number is : " +tableNumber);
		
		for(int i=1;i<=10;i++) {
			System.out.println(tableNumber+" * "+ i+" = "+tableNumber*i);
		}

	}

}


//02-User Input
import java.util.Scanner;
public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scan =new Scanner(System.in);
    System.out.println("Enter a number which you want to print a table :");
		int tableNumber=scan.nextInt();
		System.out.println("Table number is : " +tableNumber);
		
		for(int i=1;i<=10;i++) {
			System.out.println(tableNumber+" * "+ i+" = "+tableNumber*i);
		}

	}

}

