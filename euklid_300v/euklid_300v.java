class euklid_300v{
  public static void main(String[] args){
    int starta = 2;
    int startb = 1;
    long startTime = System.currentTimeMillis();
    while( starta <= 1000){
      while( startb <= starta){
        int a = starta;
        int b = startb;
        int c = 1;
        while(a > 0 && b > 0){
          if(a < b){
            b = b - a;
          }else {
            a = a - b;
          }
        }
        if(a==0){
          c = b;
        }else{
          c = a;
        }
        System.out.println("ggT von a = " + starta + " und b = " + startb + " ist c =  " + c);
        startb++;
      }
      startb = 1;
      System.out.println("---------------------" + starta + "-------------------------");
      starta++;
    }
    long endTime = System.currentTimeMillis();
    float runtime = endTime - startTime;
    System.out.println(runtime / 1000 + " sec");
  }
}
