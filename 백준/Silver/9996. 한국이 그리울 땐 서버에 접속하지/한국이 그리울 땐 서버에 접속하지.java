import java.util.*;
import java.io.*;

public class Main{
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        
        String pattern = br.readLine();
        String prefix = "";
        String suffix = "";

        // 패턴 초기화
        for(int i=0;i<pattern.length();i++){
            if(pattern.charAt(i) == '*'){
                prefix = pattern.substring(0, i);
                suffix = pattern.substring(i+1,pattern.length());
            }
        }

        // 패턴 비교
        for(int i=0;i<num;i++){
            String str = br.readLine();

            if(str.length() < prefix.length() + suffix.length()){
                bw.write("NE\n");
                continue;
            }

            if(str.startsWith(prefix) && str.endsWith(suffix)){
                bw.write("DA\n");
            }
            else{
                bw.write("NE\n");
            }
        }

        bw.flush();
        br.close();
        bw.close();
    }

}