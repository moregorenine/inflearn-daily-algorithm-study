import sys

inHour, inMinute = map(int, sys.stdin.readline().split())


# number1 = int(sys.stdin.readline())
# number2 = int(sys.stdin.readline())


def setAlramTime(inHour, inMinute, beforMinute):
    outHour = inHour
    outMinute = inMinute - beforMinute

    if outMinute < 0:
        outHour = (outHour - 1 + 24) if (outHour - 1 < 0) else outHour - 1
        outMinute += 60

    print(f'{outHour} {outMinute}')


setAlramTime(inHour, inMinute, 45)
