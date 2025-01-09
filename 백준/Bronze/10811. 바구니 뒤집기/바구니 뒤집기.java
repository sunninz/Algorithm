import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter (System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int [] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = i+1;
        }

        for (int i = 0; i < m; i++){
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken())-1;
            int finish = Integer.parseInt(st.nextToken())-1;

            int [] temp = new int[finish-start+1];
            int [] reverseArr = new int[finish-start+1];

            // arr에서 뒤집고 싶은 만큼 temp에 담음
            // temp를 뒤집음 -> reverseArr
            // arr에 reverseArr를 반영함

            for(int j = 0;j < temp.length; j++){

                temp[j] = arr[start+j];
            }

            for(int l = 0;l < reverseArr.length; l++){
                reverseArr[l] = temp[reverseArr.length-1-l];
            }
            

            for(int k = 0;k < reverseArr.length;k++){
                arr[start+k] = reverseArr[k];
            }


        }

        for (int k = 0; k < n; k++){
            System.out.print(arr[k]+ " ");

        }


        br.close();
        bw.flush();
        bw.close();
    }


}
