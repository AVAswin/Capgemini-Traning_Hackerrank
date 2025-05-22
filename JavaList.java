import java.io.*;
import java.util.*;

public class JavaList {
    public static void insert(int index, int element, List<Integer> arr) {
        if(index >= 0 && index <= arr.size()) {
            arr.add(index, element);
        }      
    }
    
    public static void delete(int index, List<Integer> arr) {
        if(index >= 0 && index < arr.size()) {
            arr.remove(index);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);    
        int n = scan.nextInt();
        List<Integer> arr = new ArrayList<>();
        for(int i=0;i<n;i++) {
            arr.add(scan.nextInt());       
        }
        
        int noOfQueries = scan.nextInt();
        for(int i=0;i<noOfQueries;i++) {
            String str = scan.next();
            if(str.equals("Insert")) {
                int index = scan.nextInt();
                int element = scan.nextInt();
                insert(index, element, arr);
            }
            else {
                int index = scan.nextInt();
                delete(index, arr);
            }
        }
        
        for(int i=0;i<arr.size();i++) {
            System.out.print(arr.get(i) + " ");
        }
    }
}