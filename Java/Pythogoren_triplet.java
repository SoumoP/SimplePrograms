import java.util.*;

public class Pythogoren_triplet {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();

        if (a > b && a > c) {
            boolean flag = ((a * a) == (b * b) + (c * c));
            System.out.println(flag);

        } else if (b > c) {
            boolean flag = ((b * b) == (a * a) + (c * c));
            System.out.println(flag);

        } else {
            boolean flag = ((c * c) == (b * b) + (a * a));
            System.out.println(flag);

        }
    }
}