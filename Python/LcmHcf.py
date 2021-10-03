'Find the LCM and HCF of 2 numbers'
def find_lcm(x, y):
    if x > y:
        greater = x
    else:
        greater = y
    while True:
        if(greater % x == 0) and (greater % y == 0):
            lcm = greater
            break
        greater += 1
    print(lcm)


def find_hcf(x, y):
    if x > y:
        smaller = y
    else:
        smaller = x
    for i in range(1, smaller+1):
        if(x % i == 0) and (y % i == 0):
            hcf = i
    print(hcf)


choice = int(input("Enter your Choice:\n1. GCD\n2. LCM\n"))
print("Enter the numbers: ")
x = int(input())
y = int(input())
if choice == 1:
    find_hcf(x, y)
elif choice == 2:
    find_lcm(x, y)
else:
    print("Wrong Choice")
