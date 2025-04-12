import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int p = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=1;i<=p;i++){
            if(p % i == 0) {
                list.add(i);
            }
        }

        try {
            bw.write(list.get(q-1)+"");
        } catch (Exception e) {
            bw.write(0+"");
        }
       
        bw.flush();
        bw.close();
        br.close();
    }
}