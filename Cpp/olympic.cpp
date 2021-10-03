#include <iostream>
using namespace std;

int main() {
	int t;
	cin>>t;
	while(t!=0)
	{int G1,S1,B1,G2,B2,S2;
		cin>>G1>>S1>>B1>>G2>>S2>>B2;
		int r1=G1+S1+B1;
		int r2=G2+S2+B2;
		if(r1!=r2)
		{
			if(r1>r2)
			cout<<1<<endl;
			else
			cout<<2<<endl;
		}
	t=t-1;
	}
}
