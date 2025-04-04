import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        List<Integer> list = new ArrayList<>(); 
        int tmp = num;

        while(tmp>0){
            list.add(tmp%n);
            tmp = tmp/n;
        }


        for(int i=list.size()-1;i>=0;i--){
            if(list.get(i)>=0 & list.get(i)<=9){
                bw.write(list.get(i)+"");
            }
            else{
                bw.write((char)(list.get(i)+55)+"");
            }

        }
        br.close();
        bw.flush();
        bw.close();
    }
}