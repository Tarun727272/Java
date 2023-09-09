//1- Write a Java program to print 'Hello' on screen and your name on a separate line.
// 01-By programmer
public class Helloname {

	public static void main(String[] args) {
		
		System.out.println("Hello");
		System.out.println("Tarun");

	}

}
// Or

// By user input
public class Helloname {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your name : ");
		
		String name=scan.nextLine();
		
		System.out.println("Hello ");
		System.out.println(name);
	}

}
