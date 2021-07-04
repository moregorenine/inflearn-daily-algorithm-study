import sys


def printUntilNumber(count):
    for i in range(count, 0, -1):
        print(f'{i}')


count = int(sys.stdin.readline())
printUntilNumber(count)
