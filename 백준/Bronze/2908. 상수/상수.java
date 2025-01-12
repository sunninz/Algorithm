import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));



        StringTokenizer st = new StringTokenizer(br.readLine());

        String a = st.nextToken();
        String b = st.nextToken();

        String a_reverse = "";
        String b_reverse = "";

        // a.length = 3
        // i = 0 to 2

        for(int i = 0; i< 3;i++){
            a_reverse = a_reverse + a.charAt(a.length()-i-1);
            b_reverse = b_reverse + b.charAt(b.length()-i-1);
        }

        int a_int = Integer.parseInt(a_reverse);
        int b_int = Integer.parseInt(b_reverse);

        int max = Math.max(a_int,b_int);

        System.out.println(max);
        
        br.close();
        bw.flush();
        bw.close();
    }


}
