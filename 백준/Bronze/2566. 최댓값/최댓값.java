import java.util.*;
import java.io.*;

public class Main{
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int [][] arr = new int[9][9];
        int col = 0;
        int row = 0;

        // 배열에 담기
        for(int i=0;i<9;i++){
            st= new StringTokenizer(br.readLine());

            for(int j=0;j<9;j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        //최대값 구하기
        int max = 0;
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                max = Math.max(max,arr[i][j]);
                if(max == arr[i][j]){
                    col = i;
                    row =j;
                }
            }
        }

        bw.write(max+"\n"+ (col+1) +" "+(row+1));

        br.close();
        bw.flush();
        bw.close();
    }
}