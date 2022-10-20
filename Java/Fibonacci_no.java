//  You've to print first n fibonacci numbers.
//  Take as input "n", the count of fibonacci numbers to print.
//  Print first n fibonacci numbers

import java.util.Scanner;

public class Fibonacci_no {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
	System.out.print("Enter a number: ");
    int n = scn.nextInt();
    scn.close();

	// the factorial of 0 and 1 is 0 by default
	if(n==0||n==1){
		System.out.println("Factorial of "+n+" is: "+0);
		return; // the main function will return and program will exit
	}
    int fact = 1;
	for(int i = 1; i < n;i++){
		fact = fact + (fact*i);
	}
	System.out.println("Factorial of "+n+" is: "+fact);
  }
}
