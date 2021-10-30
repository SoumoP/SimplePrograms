// Find closest value of a number in an Array.

import java.util.*;

class ClosestValue
{
    public static void main(String[] args)
    {
        int a[];
        int find;
        int closest = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array");
        int size = sc.nextInt();

        a = new int[size];

        System.out.println("Enter numbers in array");
        for (int i = 0; i < size; i++)
        {
            a[i] = sc.nextInt();
        }

        System.out.println("Numbers are : ");
        for (int i = 0; i < size; i++)
        {
            System.out.print(a[i] + " ");
        }

        System.out.println();
        System.out.println("Enter Number to find closest value");
        find = sc.nextInt();

        int distance = Math.abs(closest - find);

        for (int i : a)
        {
            int distanceI = Math.abs(i - find);
            if (distance > distanceI)
            {
                closest = i;
                distance = distanceI;
            }
        }

        System.out.println("Closest Value is : " + closest);
    }

}
