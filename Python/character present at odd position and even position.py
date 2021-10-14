# program to find chracter at even position and odd position

s = input("Enter some string")
print("Chracter present at odd position is", s[::2])

print("Chracter present at odd position is", s[1::2])

# 2 way
i = 0
while i < len(s):
    print(s[i], end="")
    i = i+2

i = 1
while i < len(s):
    print(s[i], end="")
    i = i+2
