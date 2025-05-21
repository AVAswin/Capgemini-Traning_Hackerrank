import java.io.*;
import java.util.*;

public class Anagrams {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine().toUpperCase();
        String b = sc.nextLine().toUpperCase();
        
        char[] chars1 = a.toCharArray();
        char[] chars2 = b.toCharArray();
        
        Arrays.sort(chars1);
        Arrays.sort(chars2);
        
        if(Arrays.equals(chars1, chars2)) {
            System.out.println("Anagrams");
        }
        else {
            System.out.println("Not Anagrams");
        }
    }
}
