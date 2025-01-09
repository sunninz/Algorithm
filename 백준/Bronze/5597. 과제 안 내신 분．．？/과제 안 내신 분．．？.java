import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter (System.out));

        //ArrayList <Integer> list = new ArrayList<>();
        int [] arr = new int[30];
        for(int i = 0; i < 30; i++){
            arr[i] = i+1;
        }


        for (int j = 0; j < 28; j++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken())-1;

            arr[num] = 0;
        }

        for (int k = 0; k < 30; k++){
            if(arr[k] != 0){
                System.out.println(arr[k]);
            }

        }

        br.close();
        bw.flush();
        bw.close();
    }


}
