import java.util.*;
import java.io.*;

public class Main{
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;
        int num = Integer.parseInt(br.readLine());

        int[] alphbet = new int[26];
        

        for(int i=0;i<num;i++){
            String str = br.readLine();
            char c = str.charAt(0);
            alphbet[c-'a']++;
        }

        boolean flag = false;
        for(int j=0;j<alphbet.length;j++){
            if(alphbet[j]>=5){
                bw.write((char)(j+'a')+"");
                flag=true;
            }
        }

        if(!flag){
            System.out.println("PREDAJA");
        }
        
        bw.flush();
        br.close();
        bw.close();
    }

}