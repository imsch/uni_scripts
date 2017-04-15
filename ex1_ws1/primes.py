i = 2
numPrimes = 0
primes = []
while (i < 1000):
    isPrime = 1
    x = 2
    while (x < i):
        if (i % x == 0):
            isPrime = 0
            break
        x = x + 1
    if (isPrime == 1):
        primes.append(i)
    i = i + 1
for e in primes:
    print(e)
