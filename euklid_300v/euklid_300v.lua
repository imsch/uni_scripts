starta = 2
startb = 1
starttime = os.time()
while (starta <= 1000) do
    while (startb <= starta)do
        a = starta
        b = startb
        c = 1
        while (a > 0 and b > 0) do
            if a < b then
                b = b - a
            else
                a = a - b
              end
            end
        if a == 0 then
            c = b
        else
            c = a
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
