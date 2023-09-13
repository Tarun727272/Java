/* 11. Write a Java program to add two binary numbers.
Input Data:
Input first binary number: 10
Input second binary number: 11
Expected Output

Sum of two binary numbers: 101 */


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] sum= new int[20];
        Scanner sc=new Scanner(System.in);

//       Take user input  of binary number
       System.out.println("Enter the first binary number : ");
       long b1=sc.nextLong();
       System.out.println("Enter the second binary number : ");
       long b2=sc.nextLong();


       int i=0,rem=0; //creating two variable

        while (b1 !=0 || b2!=0){
            sum[i++]=(int)((b1%10+b2%10+rem)%2);
            rem=(int)((b1%10+b2%10+rem)/2);
            b1/=10;
            b2/=10;
        }

        if(rem!=0){
            sum[i++]=rem;
        }
        --i;
        System.out.println("Sum of two Binary Numbers : ");
        while (i>=0){
            System.out.print(sum[i--]);
        }
        System.out.println();
        

    }
}


/*
O/P:-
Enter the first binary number : 
10101
Enter the second binary number : 
11100
Sum of two Binary Numbers : 
110001

Process finished with exit code 0

 */ 
