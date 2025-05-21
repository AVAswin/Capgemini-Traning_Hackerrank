import java.io.*;
import java.util.*;

public class StringReverse {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int i = 0, j = s.length()-1;
        
        while(i < j) {
            if(s.charAt(i) != s.charAt(j)) {
                System.out.println("No");
                return;
            }
            i++;j--;
        }
        System.out.println("Yes");
        
    }
}



