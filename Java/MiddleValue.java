// Middle value of an array.

import java.util.*;

class MiddleValue
{
    public static void main(String args[])
    {
        int[] a;
        int i, j, n, sum = 0, swap, size;

        double t;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array");
        size = sc.nextInt();

        a = new int[size];

        System.out.println("Enter numbers ");
        for (i = 0; i < size; i++)
        {
            a[i] = sc.nextInt();
        }

        System.out.println("Numbers are : ");
        for (i = 0; i < size; i++)
        {
            System.out.print(a[i] + " ");
        }

        //Sorting
        for (i = 0; i < (size - 1); i++)
        {
            for (j = 0; j < (size - i - 1); j++)
            {
                if (a[j] > a[j + 1])
                {
                    swap = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = swap;
                }
            }
        }

        System.out.println("\nNumbers in sorted order : ");
        for (i = 0; i < size; i++)
        {
            System.out.print(a[i] + " ");
        }

        //Finding the Middle Value
        if (size % 2 == 0)
        {
            n = (size + 1) / 2;
            t = (a[n] + a[n - 1]) / 2.0;
            System.out.println("\nMiddle Value is : " + t);
        }

        else
        {
            System.out.println("\nMiddle Value is : " + a[size / 2]);
        }

    }
}

