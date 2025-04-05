import java.util.*;
import java.io.*;

public class Main{
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        int [] change = {25,10,5,1};


        for(int i = 0; i<t;i++){
            int cent = Integer.parseInt(br.readLine());
            int [] result = new int[4];

            for(int j=0;j<change.length;j++){
                result[j] = cent / change[j];
                cent %= change[j];
            }

            for(int res: result){
                bw.write(res+" ");
            }
            bw.write("\n");

        }
        br.close();
        bw.flush();
        bw.close();
    }
}