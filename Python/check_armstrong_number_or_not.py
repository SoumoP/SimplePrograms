#python program to check given number is armstrong number or not
n=int(input("enter an integer number:-"))
sum=0
temp=n

while n!=0:
    r=n%10
    sum=sum+r*r*r
    n=n//10

if sum==temp:
    print(temp,"is armstrong number.")
else:
    print(temp,"is not armstrong number.")



