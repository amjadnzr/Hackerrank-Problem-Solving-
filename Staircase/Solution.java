import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the staircase function below.
     */
    static void staircase(int n) {
        for(int i=1;i<=n;i++){
           for(int j=n;j>0;j--){
               if(i>=j){
                   System.out.print("#");
               }else{
                   System.out.print(" ");
               }
           } 
             System.out.println();
        }

    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine().trim());

        staircase(n);
    }
}
