zahlen = []
i = 0
while (i <= 10):
    zahlen.append(i)
    i += 1
def BinarySearch(A, l, r, k):
    if (r < l):
        return False
    mid = (l + r) / 2
    if (A[mid] == k or l == k or r == k):
        return True
    if (k < mid):
        return BinarySearch(A, l, mid - 1, k)
    elif (k > mid):
        return BinarySearch(A, mid + 1, r, k)
enthalten = BinarySearch(zahlen, 0, len(zahlen)-1, key)
if(enthalten):
    print(str(key) + " ist enthalten")
else:
    print(str(key) + " ist nicht enthalten")
