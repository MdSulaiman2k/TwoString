import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Main {

    // Complete the twoStrings function below.
    static String twoStrings(String s1, String s2) {
        boolean chk = false ;
        if(s1.length() > s2.length()){
            String v = s1 ;
            s1 = s2 ;
            s2 = v ;
        }
        if(s1.equals(s2))
            return "YES" ;
         for(int i = 0 ; i < s1.length() && !chk ; i++)
         { 
            char ck = s1.charAt(i) ;
            for(int j =0 ; j < s2.length() && !chk ; j++ ){
                if(s2.charAt(j) == ck ){
                    return "YES" ;
                }
            }
            s1 = s1.replaceAll(Character.toString(ck) , "") ; 
         }
         return "NO" ;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
       
        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s1 = scanner.nextLine();

            String s2 = scanner.nextLine();

            String result = twoStrings(s1, s2);
            System.out.println(result) ;
          
        }

       

        scanner.close();
    }
}
