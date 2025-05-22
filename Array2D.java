import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Array2D {
    public static int calculateSum(int r, int c, List<List<Integer>> arr) {
        int sum = 0;
        for(int i=c;i<c+3;i++) {
            sum += arr.get(r).get(i);
        }
        for(int i=c;i<c+3;i++) {
            sum += arr.get(r+2).get(i);
        }
        sum += arr.get(r+1).get(c+1);
        
        return sum;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        
        int maxSum = Integer.MIN_VALUE;
        for(int r=0;r<=3;r++) {
            for(int c=0;c<=3;c++) {
                int sum = calculateSum(r, c, arr);
                maxSum = Math.max(sum, maxSum);
            }
        }
        
        System.out.println(maxSum);

        bufferedReader.close();
    }
}
