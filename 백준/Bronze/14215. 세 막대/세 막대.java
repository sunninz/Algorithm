import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] argss) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int [] arr = new int [3];
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        arr[0] = Integer.parseInt(st.nextToken());
        arr[1] = Integer.parseInt(st.nextToken());
        arr[2] = Integer.parseInt(st.nextToken());

        Arrays.sort(arr);

        if(arr[2]>=arr[0] + arr[1]){
            arr[2] = arr[0] + arr[1] -1;
        }

        System.out.println(arr[0]+arr[1]+arr[2]);
        
        

        br.close();
    }
}