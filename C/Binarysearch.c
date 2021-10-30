#include <stdio.h>

int binarysearch(int arr[],int l, int r, int key){
    if(r>=l)
    {
        int mid= l+(r-1)/2;
        if(arr[mid]==key){
            return mid;
        }
        if(arr[mid]>key){
            return binarysearch(arr,l,mid-1,key);
        }
        else{
            return binarysearch(arr,mid+1,r,key);
        }
        return -1;  
    }
  
}
int main()
{
    int n, key,index;
    printf("Enter the number of elements in the array  ");
    scanf("%d", &n);
    int arr[n];
    printf("Enter the elements in sorted array\n");
    for (int i=0; i<n; i++)
    {
        scanf("%d", &arr[i]);
    }
 
    printf("Enter the element to be searched  ");
    scanf("%d", &key);
    index= binarysearch(arr,0,n-1,key);
    if(index!=-1){
         printf("Element is present at index %d",index+1);
    }
    else{
        printf("Element not found");
    }
    return 0;
}
