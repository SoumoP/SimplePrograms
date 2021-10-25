/*

Q)
Mike found an interesting problem. In this problem you are given two integers,
n and k. You need to find the the maximum value of x, such that, n! % kx = 0.

Input Format
First line contains number of test cases, T. Each test case 
contains two integers each, n and k.

Constraints
1<=T<=20 1<=n<=10^8 2<=k<=10^8

Output Format
Print the value of x for each test case.

Sample Input
2
5 2
1000 2


Sample Output
3
994


Explanation
In the first test case, n = 5 and k = 2. So, n! = 120. n! % 2^0 = 0,
n! % 2^1 = 0, n! % 2^2 = 0, n! % 2^3 = 0, n! % 2^4 = 8, n! % 2^5 = 24, 
n! % 2^6 = 56, n! % 2^7 = 120. So, the answer should be 3.

*/


#include<iostream>
#include<math.h>
using namespace std;
 
class Ayush
{
 
    // Function to maximize the value
    // of x such that n! % (k^x) = 0
    public:
    int findX(int n, int k)
    {
        int r = n, v, u;

        int m = sqrt(k) + 1;

        for (int i = 2; i <= m && k > 1; i++) 
        {
            if (i == m)
            {
                i = k;   // prime number hai toh copy it 
            }

            for (u = v = 0; k % i == 0; v++) {
                k /= i;
            }
            
            
            // number bacha agar 
            if (v > 0) 
            {
                // temp meh n ko daala
                int t = n;
                while (t > 0) {
                    t /= i;
                    // optimize
                    u += t;
                    // u is no. of occurrences
                }
 
                r = min(r, u / v);
            }
        }
 
        return r;
    }
};
 
    int main()
    {
        Ayush g;
        int test_case;
       // cout << "Enter the number of test cases: ";
        cin >> test_case;
        
        int n;
        int k;
        
        while (test_case--)
        {
            cin >> n;
            cin >> k;
            cout<<g.findX(n, k) << endl;
        }
        
        return 0;
        
    }
