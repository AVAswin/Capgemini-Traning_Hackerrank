import java.io.*;
import java.util.*;

public class JavaArrayList {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noOfRows = sc.nextInt();
        
        List<List<Integer>> arr = new ArrayList<>();
        for(int i=0;i<noOfRows;i++) {
            int noOfElements = sc.nextInt();
            List<Integer> row = new ArrayList<>();
            for(int j=0;j<noOfElements;j++) {
                row.add(sc.nextInt());
            }
            arr.add(row);
            // 1 -> [41, 77, 74, 22, 44]
            // 2 -> [12]
            // 3 -> []
        }
              
        int noOfQueries = sc.nextInt();
        for(int i=0;i<noOfQueries;i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            if(x-1 >= noOfRows || y-1 >= arr.get(x-1).size()) {
                System.out.println("ERROR!");
            }
            else {
                System.out.println(arr.get(x-1).get(y-1));
            }
        }
    }
}