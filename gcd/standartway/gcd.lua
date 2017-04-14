starta = 2
startb = 1
starttime = os.time()
while (starta <= 1000) do
    while (startb <= starta) do
        a = starta
        b = startb
        c = 1
        i = 1
        while(i <= startb) do
            if(starta % i == 0 and startb % i == 0) then
                c = i
              end
            i = i + 1
          end
        print("ggT von a = " .. starta .. " und b = " .. startb ..
        " ist c =  " .. c)
        startb = startb + 1
      end
    startb = 1
    print("---------------------" .. starta .. "-------------------------")
    starta = starta + 1
  end
endtime = os.time()

runtime = endtime - starttime
print(runtime .. " sec")
