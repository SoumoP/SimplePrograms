#include<iostream>
using namespace std;

int main()
{
    int n;
    int res=0;
cin>>n;
    // while(n>0)
    // {
    //     if(n%2==1)
    //     {
    //          res++;
    //     }
        
    //      n/=2;
    // }

    // while(n>0)
    // {
    //     if( n & 1==1)
    //     {
    //         res++;
    //     }
    //    n= n>>1;
    // }
    // cout<<res;


 while(n>0)
    {
     res=res+ (n & 1);
       n= n>>1;
    }
    cout<<res;

    return 0;
}