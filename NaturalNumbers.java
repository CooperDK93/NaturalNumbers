// Given a number n, write a function to find the sum of the first n natural numbers

import java.util.Scanner;

public class NaturalNumbers {

 public static void main(String[] args){

     int sum = 0;

     Scanner myObj = new Scanner(System.in);
     System.out.println("Enter Number: ");
     int n = myObj.nextInt();

     for( int i = 1; i <= n; i++)
     {
         sum = sum + i;
     }
     System.out.println("Sum of Natural Numbers = " + sum);
 }

}
