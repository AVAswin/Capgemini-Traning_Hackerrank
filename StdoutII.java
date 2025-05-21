import java.io.*;
import java.util.*;

public class StdoutII {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        
        int num1 = scanner.nextInt();
        double num2 = scanner.nextDouble();
        scanner.nextLine();
        String str = scanner.nextLine();
        System.out.println("String: " + str);
        System.out.println("Double: " + num2);
        System.out.println("Int: " + num1);
    }
}
