import sys

# inHour, inMinute = map(int, sys.stdin.readline().split())

number = int(sys.stdin.readline())


def displayMultiplicationTable(number, count):
    for i in range(1, count + 1):
        print(f'{number} * {i} = {number * i}')


displayMultiplicationTable(number, 9)
