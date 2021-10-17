#include <bits/stdc++.h>
using namespace std;
#define ll                          int
#define pb                          push_back
#define ff                          first
#define ss                          second

#define mem(arr,val)                memset(arr, val, sizeof(arr))
#define pd(n,l)                     cout<<setprecision(l)<<n
#define lcm(a,b)                    (a/__gcd(a,b))*b

#define fl(i,a,b)                   for(ll i=a; i<b; i++)
#define fr(i,a,b)                   for(ll i=b-1; i>=a; i--)

#define ins(s)                      string s;          cin>>s;
#define in1(a)                      ll a;              cin>>a;
#define in2(a, b)                   ll a, b;           cin >> a >> b;
#define in3(a, b, c)                ll a, b, c;        cin >> a >> b >> c;
#define in4(a, b, c, d)             ll a, b, c, d;     cin >> a >> b >> c >> d;

#define InVec(v,n)                  vector<ll> v(n); fl(i,0,n) {cin>>v[i];}
#define InArr(a,n)                  ll a[n]; fl(i,0,n) {cin>>a[i];}
#define InArrSum(a,n,sum)           ll a[n]; fl(i,0,n) {cin>>a[i]; sum += a[i];}
#define InVecSum(v,n,sum)           vector<ll> v(n); fl(i,0,n) {cin>>v[i]; sum += v[i];}

#define sz(s)                       s.size()

#define dsc                         greater<ll>()
#define all(x)                      (x).begin(), (x).end()

#define pln(n)                      cout << n << "\n"   
#define pls(n)                      cout << n << " "   
#define pt(n)                       cout << n
#define ln                          cout << "\n"   

#define pmap(mp)                    for(auto i: mp) {p2(i.ff,i.ss);}
#define printArrVec(a)              for(auto it:a)  {cout<<it<<" ";} ln;
#define p1(a);                      cout<< a << "\n";   
#define p2(a,b);                    cout<< a <<" "<< b << "\n";      
#define p3(a,b,c);                  cout<< a <<" "<< b <<" "<< c << "\n";
#define YES                         pln("YES")
#define Yes                         pln("Yes")
#define NO                          pln("NO")
#define No                          pln("No")

#define mod 1000000007


//subset of a vector
set<ll>  subset(vector<ll> v){
    set<ll> subsetSum;
    ll n = v.size();

    for(ll p=0; p <= 1<<n; p++){  //loop till 2^n

        ll sum =0;
        for(ll j=0; j < n; j++){
            if(p & (1<<j)){
                sum += v[j];
            }
        }
        subsetSum.insert(sum);
    }

    return subsetSum;
}

void solve(){
    
    vector<ll> a;
    a={1,2,3,4,5,6};
    ll n = sz(a);
    ll rSum = 8;         // 2+4+6

    
    vector<ll> left;
    vector<ll> right;

    set<ll> leftSum;
    set<ll> rightSum;
    
    fl(i,0,n/2)  left.pb(a[i]);
    fl(i,n/2,n)  right.pb(a[i]);
    
    leftSum = subset(left);
    rightSum = subset(right);

    for(auto i: leftSum){
        if(rightSum.find(rSum - i) != rightSum.end()){
            YES;
            return;
        }
    }
    NO;
}

//int32_t 
int32_t main(){

    ios_base::sync_with_stdio(false);
    cin.tie(0);cout.tie(0);

    //in1(T);  while(T--)  
        solve();
        
    return 0;
    // return 0LL;
}