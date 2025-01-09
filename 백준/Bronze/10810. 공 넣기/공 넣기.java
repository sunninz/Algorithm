import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter (System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        //ArrayList <Integer> list = new ArrayList<>(n);
        int [] arr = new int[n];
        Arrays.fill(arr,0);


        for (int i = 0; i < m; i++){
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int finish = Integer.parseInt(st.nextToken());
            int ball = Integer.parseInt(st.nextToken());

            for (int j = start-1; j <= finish-1; j++){
                arr[j]=ball;
            }

        }

        for(int k = 0; k <arr.length; k++){
            System.out.print(arr[k] + " ");
        }

        br.close();
        bw.flush();
        bw.close();
    }




}
