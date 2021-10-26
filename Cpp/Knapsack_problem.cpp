#include<iostream>
using namespace std;
int knapsack(int value[],int wt[],int n,int w){
    if(n==0 || w==0){
        return 0;
    }else if(wt[n-1]>w){
        return knapsack(value,wt,n-1,w);
    }
    return max(knapsack(value,wt,n-1,w-wt[n-1]+value[n-1]),knapsack(value,wt,n-1,w));
}
int main(){
    int n,w;
    cout<<"the number of items - ";
    cin>>n;
    cout<<"the total weight - ";
    cin>>w;
    int value[n];
    cout<<"Enter the values - ";
    for(int i=0;i<n;i++){
        cin>>value[i];
    }
    int wt[n];
    cout<<"Enter the weights - ";
    for(int i=0;i<n;i++){
        cin>>wt[i];
    }
    cout<<knapsack(value,wt,n,w);
}
