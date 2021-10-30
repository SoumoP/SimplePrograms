// 5. WAP to find X to the power of Y 

#include <stdio.h>
int main(){
    int x , y ;
    unsigned int res = 1;
    printf(" Enter vaule of x (base) : ");
    scanf("%d",&x);
    printf(" Enter vaule of y (exponent) : ");
    scanf("%d", &y);

    while (y != 0)
    {
        res *= x;
        --y;
    }

    printf(" The value of x^y is %ld ", res);
    return 0;
}