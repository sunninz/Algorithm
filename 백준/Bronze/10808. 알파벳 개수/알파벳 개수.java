import java.util.*;
import java.io.*;

public class Main{
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 출력할 배열
        int [] arr = new int[26];

        String str = br.readLine();
        for (char c: str.toCharArray()){
            arr[c-'a'] +=1;
        }
        
        for(int i=0;i<arr.length;i++){
            bw.write(arr[i]+" ");
        }
        
        bw.flush();
        br.close();
        bw.close();
    }

}