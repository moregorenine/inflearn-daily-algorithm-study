import sys


def printUntilNumber(count):
    for i in range(1, count + 1):
        print(f'{i}')


count = int(sys.stdin.readline())
printUntilNumber(count)
