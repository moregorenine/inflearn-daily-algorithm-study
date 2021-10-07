import sys

number1 = int(sys.stdin.readline())
number2 = int(sys.stdin.readline())
countTen = 1
total = 0


def printResult(number1, number2, countTen, total):
    digit = number2 % 10
    rest = int(number2 / 10)
    if rest >= 0:
        result = number1 * digit
        print(result)
        total += result * countTen
        countTen = countTen * 10
    if rest > 0:
        printResult(number1, rest, countTen, total)
    else:
        print(total)


printResult(number1, number2, countTen, total)
