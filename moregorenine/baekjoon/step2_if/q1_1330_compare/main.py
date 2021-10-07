import sys

number1, number2 = map(int, sys.stdin.readline().split())

if number1 > number2:
    print(">")
elif number1 < number2:
    print("<")
else:
    print("==")
