import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int [] arr = {1,1,2,2,2,8};
        int [] arrHave = new int[6];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i < arr.length; i++){
            arrHave[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i <arr.length; i++){
            bw.write(arr[i]-arrHave[i]+" ");
        }

        br.close();
        bw.flush();
        bw.close();
    }

}
