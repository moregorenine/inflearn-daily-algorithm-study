import sys

number = int(sys.stdin.readline())


def printScoreToGrades(number):
    grades = ""
    if number >= 90:
        grades = "A"
    elif number >= 80:
        grades = "B"
    elif number >= 70:
        grades = "C"
    elif number >= 60:
        grades = "D"
    else:
        grades = "F"
    print(grades)


printScoreToGrades(number)