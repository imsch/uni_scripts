import random
A = []
count = 10
x = 0
while (x < count):
    A.append(random.randint(1, count))
    x = x + 1
j = 1
print(A)
while (j < len(A)):
    key = A[j]
    i = j -1
    while (i >= 0 and A[i] > key):
        A[i + 1] = A[i]
        i = i - 1
        print(A)
    A[i + 1] = key
    j = j + 1
print(A)
