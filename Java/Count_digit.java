
import java.util.*;

public class Count_digit {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Enter a number to count digits");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();
        int count = 0;
        while (n != 0) {
            n = n / 10;
            count++;
        }
        System.out.println(count);
    }
}