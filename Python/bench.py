for _ in range(int(input())):
    n=int(input())
    a=list(map(int,input().split()))
    d={}
    for i  in range(n):
        d[a[i]-i]=d.get(a[i]-i,0)+1
    #print(d)
    res=0
    for i in d.values():
        res+= i * (i - 1) // 2
    print(res)
