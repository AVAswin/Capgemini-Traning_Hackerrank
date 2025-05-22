import java.io.*;
import java.util.*;

public class PhoneBook {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        scan.nextLine();
        Map<String, Integer> mpp = new HashMap<>();
        for(int i=0;i<n;i++) {
            String str = scan.nextLine();
            int phone = scan.nextInt();
            scan.nextLine();
            mpp.put(str, phone);
        }
        
        while(scan.hasNext()) {
            String str = scan.nextLine();
            if(mpp.containsKey(str)) {
                System.out.println(str + "=" + mpp.get(str));
            }
            else {
                System.out.println("Not found");
            }
        }
    }
}