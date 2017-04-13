import time
starta = 2
startb = 1
starttime = time.time()
while (starta <= 1000):
    while (startb <= starta):
        a = starta
        b = startb
        c = 1
        while (a > 0 and b > 0):
            if a < b:
                b = b - a
            else:
                a = a - b

        if a == 0:
            c = b
        else:
            c = a

        print(("ggT von a = " + str(starta) + " und b = " + str(startb) +
        " ist c =  " + str(c)))
        startb = startb + 1
    startb = 1
    print(("---------------------" + str(starta) + "-------------------------"))
    starta = starta + 1
endtime = time.time()

runtime = endtime - starttime
print((str(runtime) + " sec"))