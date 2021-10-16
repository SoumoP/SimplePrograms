
#program to reverse internal content of each word

s = input("Enter some string")
l = s.split()
l1 = []
i = len(l)-1

while i >=0:
    l1.append(l[i][::-1])
    i = i-1
    output = ' '.join(l1)
print(output)
    
