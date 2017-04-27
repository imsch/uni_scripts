import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Objects;
class bruteforce {

    public static String enterPw() {
      Scanner input = new Scanner(System.in);
        System.out.println("Bitte geben Sie ihr Passwort ein:");
        String pw = input.next();
        return pw;
    }

    public static void forceUnlock(String pw)
    {
      int count = 0;
      char[] in = new char[4];
      boolean unlocked = false;
      while (!unlocked){
        for (char i = '!'; (int) i <= 255; i++) {
          in[0] = i;
          for (char j = '!'; (int) j <= 255; j++) {
            in[1] = j;
            for (char k = '!'; (int) k <= 255; k++) {
              in[2] = k;
              for (char l = '!'; (int) l <= 255; l++) {
                in[3] = l;
                count++;
                unlocked = unlock(pw, new String(in));
                if(unlocked){break;}
              }
              if(unlocked){break;}
            }
            if(unlocked){break;}
          }
          if(unlocked){break;}
        }
        if(unlocked){break;}
      }
      System.out.println("Unlocked, password was: " + new String(in) + "\n" + count + " tries needed!");
    }

    public static boolean unlock(String passwd, String input){
      if (Objects.equals(passwd, input)){
        return true;
      }
      return false;
    }

    public static void main(String[] args){
      String password = enterPw();
      forceUnlock(password);
    }
}
