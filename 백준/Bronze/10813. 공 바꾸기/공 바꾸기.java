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

        for(int i = 0; i < arr.length; i++){
            arr[i] = i+1;
        }


        for (int j = 0; j < m; j++){
            st = new StringTokenizer(br.readLine());
            int bucket1 = Integer.parseInt(st.nextToken())-1;
            int bucket2 = Integer.parseInt(st.nextToken())-1;

            int temp = arr[bucket1];
            arr[bucket1] = arr[bucket2];
            arr[bucket2] = temp;


        }

        for(int k = 0; k <arr.length; k++){
            System.out.print(arr[k] + " ");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    
}
