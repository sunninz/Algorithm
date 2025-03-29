import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        // 2차원 배열 선언
        int[][] first_array = new int[n][m];
        int[][] second_array = new int[n][m];

        //
        for(int i=0; i<n;i++){
            String[] s = br.readLine().split(" ");
            for (int j=0;j<m;j++){
                first_array[i][j]=Integer.parseInt(s[j]);
            }
        }

        for(int i=0; i<n;i++){
            String[] s = br.readLine().split(" ");
            for (int j=0;j<m;j++){
                second_array[i][j]=Integer.parseInt(s[j]);
            }
        }


        for(int i=0; i<n;i++){
            for (int j=0;j<m;j++){
                bw.write((first_array[i][j] + second_array[i][j])+" ");
            }
            bw.write("\n");
        }
        
        bw.flush();
        bw.close();
        br.close();

    }
}