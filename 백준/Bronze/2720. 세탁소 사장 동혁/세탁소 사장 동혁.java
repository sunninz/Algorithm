import java.util.*;
import java.io.*;

public class Main{
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for(int i = 0; i<t;i++){
            int cent = Integer.parseInt(br.readLine());
            int q , d , n, p;
            q = cent / 25;
            cent %= 25;
            d = cent / 10;
            cent %=10;
            n = cent / 5;
            p = cent % 5;

            bw.write(q+" "+d+" "+n+" "+p +"\n" );

        }
        br.close();
        bw.flush();
        bw.close();
    }
}