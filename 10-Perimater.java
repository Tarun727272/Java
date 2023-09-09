/* 11. Write a Java program to print the area and perimeter of a circle.
Test Data:
Radius = 7.5
Expected Output
Perimeter is = 47.12388980384689
Area is = 176.71458676442586*/


public class Perimeter {

	public static void main(String[] args) {
		float rad=7.5f;
		
		System.out.println("The perimeter of circle is : "+ ((2*3.14)*rad));
		System.out.println("The area of circle is : "+ ((3.14)*rad*rad));

	}

}
