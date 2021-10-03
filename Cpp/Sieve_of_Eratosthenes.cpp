//To find prime in a efficient way
//Time complexity : O(n*log(log(n))) 
//This Algorithm for suppose you have to find 30th prime no

#include<bits/stdc++.h>
using namespace std;

int prime[1001];
void SOE()
{
    int arr[8000]={0};
    for(int i=2;i*i<=7999;i++)
    {
        if(arr[i]==0)
        {
            for(int j=i*i;j<=7999;j+=i)
               arr[j]=1;
        }
    }
    int k=1;
    for(int i=2;i<=7999;i++)
    {
        if(arr[i]==0)
        {
            prime[k]=i;
            k++;
        }
    }
} 

int main()
{
    //
    int n;
    //Enter the nth prime number which you to find
    cin>>n;
    SOE();
    cout<<prime[n]<<endl;
}