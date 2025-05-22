import java.io.*;
import java.util.*;

public class HashSett {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];       
        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }
        
        Set<String> uniquePairs = new HashSet<>();
        for (int i = 0; i < t; i++) {
            String[] pair = {pair_left[i], pair_right[i]};
            Arrays.sort(pair); // Sort the pair to ensure consistent ordering
            String sortedPair = pair[0] + "," + pair[1];
            uniquePairs.add(sortedPair);
            System.out.println(uniquePairs.size());
        }
    }
}
