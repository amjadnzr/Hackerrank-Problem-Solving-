import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

   // Complete the kangaroo function below.
   static String kangaroo(int x1, int v1, int x2, int v2) {
          String answer="NO";
        
         if(x1>x2){
             if(v1>=v2){
                 answer="NO";
             }else{
                 while(x1>=x2){
                    if(x1==x2){
                        answer="YES";
                    }

                    x1+=v1;
                    x2+=v2;
                 }
             }
         }
         else if(x1==x2){
             if(v1==v2){
                 answer="YES";
             }else{
                 answer="NO";
             }
         }

         else{
             if(v2>=v1){
                 answer="NO";
             }else{
                 while (x2 >= x1) {
                   if (x1 == x2) {
                       answer = "YES";
                   }

                   x1 += v1;
                   x2 += v2;
               }
             }
         }


           return answer;
   }

   private static final Scanner scanner = new Scanner(System.in);

   public static void main(String[] args) throws IOException {
       BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

       String[] x1V1X2V2 = scanner.nextLine().split(" ");

       int x1 = Integer.parseInt(x1V1X2V2[0]);

       int v1 = Integer.parseInt(x1V1X2V2[1]);

       int x2 = Integer.parseInt(x1V1X2V2[2]);

       int v2 = Integer.parseInt(x1V1X2V2[3]);

       String result = kangaroo(x1, v1, x2, v2);

       bufferedWriter.write(result);
       bufferedWriter.newLine();

       bufferedWriter.close();
       scanner.close();
   }
}  

