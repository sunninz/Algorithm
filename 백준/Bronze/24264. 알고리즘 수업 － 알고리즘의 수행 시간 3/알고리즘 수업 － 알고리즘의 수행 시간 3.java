import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] argss) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        long n = Integer.parseInt(br.readLine());

        System.out.println(n*n);
        System.out.println(2);
        

        br.close();
    }
}