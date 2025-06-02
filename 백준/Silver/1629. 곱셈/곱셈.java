import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        long c = Long.parseLong(st.nextToken());

        System.out.println(pow(a,b,c));

        br.close();
    }

    static long pow(long a, long exponent,long c){
        if(exponent == 1){
            return a%c;
        }

        long temp = pow(a,exponent/2,c);
        long result = (temp*temp) % c;
        if(exponent % 2 == 1){
            return (result*(a%c))%c;
        }

        return result;
    }
}