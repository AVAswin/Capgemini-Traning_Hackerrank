import java.io.*;
import java.util.*;

public class LoopsII {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        while(q > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            
            int sum = a;
            int state = b;
            for(int i=0;i<c;i++) {
                sum += state;
                System.out.print(sum + " ");
                state = state * 2;
            }
            q--;
            System.out.println();
        }
    }
}
