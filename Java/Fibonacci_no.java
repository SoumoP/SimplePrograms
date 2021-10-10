//  You've to print first n fibonacci numbers.
//  Take as input "n", the count of fibonacci numbers to print.
//  Print first n fibonacci numbers

import java.util.*;

public class Fibonacci_no {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    scn.close();
    int a = 0;
    int b = 1;
    for (int i = 0; i < n; i++) {
      System.out.println(a);
      int c = a + b;
      a = b;
      b = c;

    }
  }
}