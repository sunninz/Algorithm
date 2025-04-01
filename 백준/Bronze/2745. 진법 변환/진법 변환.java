import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        String s = st.nextToken();
        int n = Integer.parseInt(st.nextToken());

        char[] arr = new char[s.length()];

        for(int i=0,num=s.length();i<num;i++){
            arr[i] = s.charAt(num-i-1);

        }

        
        char[] list = {'0','1','2','3','4','5','6','7','8','9',
                'A','B','C','D','E','F','G','H','I','J','K','L',
        'M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        int total=0;

        for(int i=0;i<arr.length;i++){
            for(int j = 0;j<list.length;j++)
            {
                if(list[j] == arr[i])
                {
                    total += j * (int) (Math.pow(n,i));
                }
            }
        }

        bw.write(total+"");

        br.close();
        bw.flush();
        bw.close();
    }
}