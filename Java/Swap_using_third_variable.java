import java.util.Scanner;

public class Swap_using_third_variable {
    public void swap(int a, int b) {
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping the values are a =" + a + " b =" + b);
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
