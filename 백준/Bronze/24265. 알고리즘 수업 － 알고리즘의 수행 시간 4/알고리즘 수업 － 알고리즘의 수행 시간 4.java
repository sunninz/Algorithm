import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] argss) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        long n = Long.parseLong(br.readLine());
        long count = 0;
        for(int i=1;i<n;i++){
            count +=i;
        }
        System.out.println(count);
        System.out.println(2);
        

        br.close();
    }
}