# solution 1
from collections import Counter


def match_answers(student, answers):
    count = 0
    for s, a in zip(student, answers):
        if s == a:
            count += 1

    return count


def solution(answers):
    s_1 = [1, 2, 3, 4, 5]
    s_2 = [2, 1, 2, 3, 2, 4, 2, 5]
    s_3 = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5]

    result = []
    result.append((1, match_answers(s_1, answers)))
    result.append((2, match_answers(s_2, answers)))
    result.append((3, match_answers(s_3, answers)))
    print(result)
    answer = 0
    max_student = []
    max_score = 0
    for student, score in result:
        if max_score <= score:
            max_score = score
            max_student.append(student)

    print(max_student)
    return answer


print(solution([1, 3, 2, 4, 2]))
