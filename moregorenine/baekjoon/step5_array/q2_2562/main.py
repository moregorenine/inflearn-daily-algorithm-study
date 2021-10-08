numbers = [int(input()) for a in range(9)]
max_number = max(numbers)
max_number_index = numbers.index(max_number) + 1
print(max_number, max_number_index)
