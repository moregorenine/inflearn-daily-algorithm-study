import sys


def setTwoNumbersUntilCount(count):
    twoNumbers = []

    for i in range(0, count):
        twoNumbers.append(sys.stdin.readline())

    return twoNumbers


def showSum(twoNumbers):
    for item in twoNumbers:
        twoNumber = item.split(" ")
        print(int(twoNumber[0]) + int(twoNumber[1]))


count = int(sys.stdin.readline())
twoNumbers = setTwoNumbersUntilCount(count)
showSum(twoNumbers)
