#include<iostream>
using namespace std;

int binarysearch( int num[],int key,int f)
{
	int e , s;
	s=0;
	e=f;
	while( s<=e)
	{
	  int mid = (s+e)/2;
	  if( num[mid]==key)
	  {
	  
	  return mid;
    }    
	
	else if( num[mid]>key)
	{
		 e= mid-1;
	}
	else
	{
		s=mid+1;
	}
}
  return -1;
}

 int main()
{
    int i,j;
	int num[j];

	cin>>j;
	for( i=0;i<j;i++)
	{
		cin>>num[i];
	}
	int key;
	cin>>key;
	cout<<binarysearch(num,key,j)<<endl;
}
