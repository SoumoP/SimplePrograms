import java.util.*;

public class BubbleSortNames {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String names[]=new String[10],tmp;
        System.out.println("Enter names in the array=");
        for (int i=0;i<names.length;i++) {
            System.out.print("names["+i+"]=");
            names[i]=in.nextLine();
        }
        for (int i=0;i<names.length-1;i++) {
            for (int j=i+1;j<names.length;j++)
                if (names[i].compareTo(names[j])<0) {
                    tmp= names[i];
                    names[i]= names[j];
                    names[j]= tmp;
                }
            }
        }
        System.out.println("Sorted array in descending order is=");
        for (int i=0;i<names.length;i++) {
            System.out.println(names[i]);
        }
    }
}
