import java.util.Scanner;

public class Swap_without_third_variable {
    public void Swap(int x, int y) {
        // Difference of 2nd from 1st is stored in first variable
        x = y - x;
        // sum of first and second is stored in second
        y = x + y;
        // Difference of 1st from 2nd is replaced in first variable
        x = x - y;
        System.out.println("After swapping the values  are a =" + x + " b =" + y);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter two integers to swap");
        int x = scn.nextInt();
        int y = scn.nextInt();
        System.out.println("Before swapping the values of are a =" + x + " b =" + y);
        scn.close();
        Swap_using_third_variable o = new Swap_using_third_variable();
        o.swap(x, y);
    }
}
/*
 * another logic for doing this m = 20 n =10 m = m * n ; n = m/n ; m = m/n ;
 */
