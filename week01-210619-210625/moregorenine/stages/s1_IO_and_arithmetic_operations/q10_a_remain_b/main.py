import sys

number1, number2, number3 = map(int, sys.stdin.readline().split())

print((number1 + number2) % number3)
print(((number1 % number3) + (number2 % number3)) % number3)
print((number1 * number2) % number3)
print(((number1 % number3) * (number2 % number3)) % number3)
