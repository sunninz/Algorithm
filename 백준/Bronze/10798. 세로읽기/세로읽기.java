import java.util.*;
import java.io.*;

public class Main{
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        String [][] arr = new String [5][15];
        int max = 0;

        // 배열에 담기
        for(int i=0;i<5;i++){
            String[] s = br.readLine().split("");
            max = Math.max(s.length,max);
            for(int j=0;j<s.length;j++){
                arr[i][j] = s[j];
            }
        }

        for(int i=0;i<max;i++){
            for(int j=0;j<5;j++){
                if(arr[j][i] == null) continue;
                bw.write(arr[j][i]);
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }
}