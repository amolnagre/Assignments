package Assignment2;

import java.util.Scanner;

public class Program24 {
// work in progress	
	//24. validate a password
public static void main(String[] args) {
	
	
    Scanner s = new Scanner(System.in);
    String st = s.next();
    boolean b = validatingPassword(st);
    if(b == true)
          System.out.println("valid password");
    else
          System.out.println("Invalid Password");
}
public static boolean validatingPassword(String st) {
    boolean b1 = false,b2 = false;
    if(Character.isUpperCase(st.charAt(0)))
          if(Character.isLowerCase(st.charAt(st.length()-1)))
                if(st.length() >= 6 && st.length() <= 20)
                      for (int i = 0; i < st.length();i++) {
                            char c = st.charAt(i);
                            if(Character.isDigit(c)){
                                  b1 = true; break;
                            }
}
int x = 0,y = 0;
for(int i = 0; i < st.length(); i++)
    if(Character.isUpperCase(st.charAt(i)))
          x++;
    else if(Character.isLowerCase(st.charAt(i)))
          y++;
    if(b1 == true)
          if(x > y)
                for (int i = 0; i < st.length();i++) {
                      char c = st.charAt(i);
                      if(c == '#' || c == '@' || c == '$'){
                            b2 = true; break;
                      }
                }
    return b2;
}

}
