import time
starta = 2
startb = 1
starttime = time.time()
while (starta <= 1000):
    while (startb <= starta):
        a = starta
        b = startb
        c = 1
        i = 1
        while(i <= startb):
            if(starta % i == 0 and startb % i == 0):
                c = i
            i += 1
        print(("ggT von a = " + str(starta) + " und b = " + str(startb) +
        " ist c =  " + str(c)))
        startb = startb + 1
    startb = 1
    print(("---------------------" + str(starta) + "-------------------------"))
    starta = starta + 1
endtime = time.time()

runtime = endtime - starttime
print((str(runtime) + " sec"))