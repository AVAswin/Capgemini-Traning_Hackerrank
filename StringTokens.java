import java.io.*;
import java.util.*;

public class StringTokens {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        String word = "";
        List<String> ans = new ArrayList<>();
        
        for(int i=0;i<str.length();i++) {
            char ch = str.charAt(i);
            if(Character.isLetter(ch)) {
                word += ch;
            }
            else {
                if(word != "") ans.add(word);
                word = "";
            }
        }
        if(word != "") ans.add(word);
        
        System.out.println(ans.size());
        for(int i=0;i<ans.size();i++) {
            System.out.println(ans.get(i));
        }
    }
}
