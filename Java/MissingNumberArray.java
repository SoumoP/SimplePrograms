// Missing number in an array.

class MissingNumberArray
{
    public static int count = 0;
    public static int position = 0;
    public static boolean flag = false;

    public static void main(String[] args)
    {
        int a[] = {0, 1, 2, 3, 4, 6, 7, 11, 12, 13, 14, 15, 17, 20, 21, 23};

        findMissingNumbers(a, position);
    }

    private static void findMissingNumbers(int a[], int position)
    {
        if (position == a.length - 1)
            return;

        for (; position < a[a.length - 1]; position++)
        {
            if ((a[position] - count) != position)
            {
                System.out.println("Missing Number: " + (position + count));
                flag = true;
                count++;
                break;
            }
        }

        if (flag)
        {
            flag = false;
            findMissingNumbers(a, position);
        }
    }
}
