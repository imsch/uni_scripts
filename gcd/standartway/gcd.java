class gcd{
  public static void main(String[] args) {
    int starta = 2;
    int startb = 1;
    long starttime = System.currentTimeMillis();
    while (starta <= 1000) {
        while (startb <= starta) {
            int  a = starta;
            int b = startb;
            int c = 1;
            int i = 1;
            while(i <= startb) {
                if(starta % i == 0 && startb % i == 0)
                    c = i;
                i = i + 1;
                }

            System.out.println("ggT von a = " + starta + " und b = " + startb +
            " ist c =  " + c);
            startb = startb + 1;
          }
        startb = 1;
        System.out.println("---------------------" + starta + "-------------------------");
        starta = starta + 1;
      }
    long endtime = System.currentTimeMillis();

    long runtime = endtime - starttime;
    System.out.println(runtime / 1000.00 + "sec");
  }
}
