package sherlock;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

import static java.lang.Math.*;

public class Solution {

    // Complete the squares function below.
    static int squares(int a, int b) {
        int count=0;

        for (int i = a; i <= b; i++) {
            if (sqrt(i)%1==0){
                count++;
                i+=sqrt(i)*2;
            }
        }
        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {


        int q = scanner.nextInt();
        scanner.nextLine();

        for (int qItr = 0; qItr < q; qItr++) {
            String[] ab = scanner.nextLine().split(" ");

            int a = Integer.parseInt(ab[0]);

            int b = Integer.parseInt(ab[1]);

            int result = squares(a, b);
            System.out.println(result);
        }


        scanner.close();
    }
}
