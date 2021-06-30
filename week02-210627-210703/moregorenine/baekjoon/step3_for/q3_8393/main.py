import sys


def showSum(number):
    sum = 0
    for i in range(1, number + 1):
        sum += i
    print(f'{int(sum)}')


number = int(sys.stdin.readline())
showSum(number)
