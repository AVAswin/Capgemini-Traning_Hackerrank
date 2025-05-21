import java.io.*;
import java.util.*;

public class StringsIntro {
    public static void checkLexography(String str1, String str2) {
        int result = str1.compareTo(str2);
        if(result <= 0) {
            System.out.println("No");
        }
        else {
            System.out.println("Yes");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        
        System.out.println(str1.length() + str2.length());
        checkLexography(str1, str2);
        
        System.out.println((str1.substring(0, 1).toUpperCase()+str1.substring(1) )+ " " + (str2.substring(0, 1).toUpperCase() + str2.substring(1)));
    }
}
