N = int(input())
numbers = []
for i in range(N):
    numbers.append(int(input()))

minus = [x for x in numbers if 0 >= x]
minus.sort()
little = [x for x in numbers if 0 < x and x < 2]
large = [x for x in numbers if x >= 2]
large.sort(reverse=True)

result = sum(little)
for i in range(0, len(large), 2):
    if i+1 == len(large):
        result += large[i]
    else:
        result += (large[i]*large[i+1])

for i in range(0, len(minus), 2):
    if i+1 == len(minus):
        result += minus[i]
    else:
        result += (minus[i]*minus[i+1])
print(result)
