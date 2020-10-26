import java.util.Scanner;

public class testcodeingbat {
    
    public String notString(String str) {
        if (str.contains("not") || str.contains("is not"))
        {
          return str;
        }
        else
        {
          String strnot = "not " + str;
          return strnot;
        }
        
      }
     String ans = notString("is not");
     
    
}
