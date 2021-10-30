// WAP to print Fibonacci series. 0 1 1 2 3 5 8 13 … till 100

#include <stdio.h>
int main(){
    int  fib = 0, fib1 = 0 ,fib2 = 1;;
    printf("Fibonacci series till 100 : %d %d ", fib1 , fib2);
    fib = fib1 + fib2 ;
    while (fib <= 100)
    {
        printf("%d ", fib);
        fib1 = fib2;
        fib2 = fib;
        fib = fib1 + fib2 ;

    }
    return 0;
}