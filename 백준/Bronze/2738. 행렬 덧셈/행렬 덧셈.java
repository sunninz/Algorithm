import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        // 2차원 배열 선언
        int[][] first_array = new int[n][m];
        int[][] second_array = new int[n][m];
        int[][] sum = new int[n][m];
        for(int i=0; i<n;i++){
            st = new StringTokenizer(br.readLine());
            for (int j=0;j<m;j++){
                first_array[i][j]=Integer.parseInt(st.nextToken());
            }
        }

        for(int i=0; i<n;i++){
            st = new StringTokenizer(br.readLine());
            for (int j=0;j<m;j++){
                second_array[i][j]=Integer.parseInt(st.nextToken());
            }
        }


        for(int i=0; i<n;i++){
            for (int j=0;j<m;j++){
                sum[i][j] = first_array[i][j] + second_array[i][j];
            }
        }

        for(int i=0; i<n;i++){
            for (int j=0;j<m;j++){
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }

    }
}