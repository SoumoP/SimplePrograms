// C Program to perform MERGE SORT

#include<stdio.h>
#include<conio.h>
void mergeSort(int[],int,int);
void main()
{
	int a[10],low,up,i,n;
	printf("Length of the array: ");
	scanf("%d",&n);
	low=0;
	up=n-1;
	printf("Enter the numbers: \n");
	for(i=0;i<n;i++) //Input the array
		scanf("%d",&a[i]);
	mergeSort(a,low,up);
	printf("sorted array is: ");
	for(i=0;i<n;i++) //Display sorted array
		printf("%d ",a[i]);
}
// Merges two subarrays of arr[].
// First subarray is arr[low..m]
// Second subarray is arr[m+1..up]
void merge(int a[], int low, int m, int up)
{
	int l[10], r[10],i,j,k,n01,n02;
	n01=m-low+n01;
	n02=up-m;
	for(i=0;i<n01;i++)
	{
		l[i]=a[low+i];
	}
	for (j=0;j<n02;j++)
	{
		r[j]=a[m+1+j];
	}
	i=0;
	j=0;
	for(k=low;k<=up;k++)
	{
		if(l[i]<=r[j])
		{
			a[k]=r[j];
			j++;
			
		}
	}
}
void mergeSort(int a[], int low, int up) // low is for left index and up is right index of the sub-array of arr to be sorted
{
	int m;
	if(low<up)
	{
		m=(low+up)/2;
		// Sort first and second halves
		mergeSort(a,low,m);
		mergeSort(a,m+1,up);
		merge(a,low,m,up);
	}
}
