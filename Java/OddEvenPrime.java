import java.util.*;

public class test {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num= sc.nextInt();
        int ch=0,i,flag;
        if (num%2==0) {
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }
        flag=0;
        for (i=2;i<=num/2;++i) {
            if (num%i==0) {
                flag=1;
                break;
            }
        }
        if (flag==0) {
            System.out.println("Prime");
        }
        else {
            System.out.println("Not Prime");
        }
    }
}
