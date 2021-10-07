import sys


def printMinMax(numbers):
    current = numbers[0]
    min = current
    max = current

    for i in range(1, len(numbers)):
        current = numbers[i]
        if current > max:
            max = current
        if current < min:
            min = current

    print(f'{min} {max}')


count = int(sys.stdin.readline())
numbers = list(map(int, sys.stdin.readline().split()))
printMinMax(numbers)
