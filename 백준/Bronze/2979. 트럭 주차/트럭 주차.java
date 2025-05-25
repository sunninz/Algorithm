import java.util.*;
import java.io.*;

public class Main{
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int[] arr = new int[101];
        int charge = 0;

        for(int i=0;i<3;i++){
            st=new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            for(int j=start;j<end;j++){
                arr[j]+=1;
            }
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                charge += a*1;
            }
            else if(arr[i]==2){
                charge +=b*2;
            }
            else if(arr[i]==3){
                charge += c*3;
            }
            else{
                continue;
            }
        }

        bw.write(charge+"");
        
        bw.flush();
        br.close();
        bw.close();
    }

}