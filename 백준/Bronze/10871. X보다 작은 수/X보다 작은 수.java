import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());

        ArrayList <Integer> list = new ArrayList<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++){
            int num = Integer.parseInt(st.nextToken());
            if(num < x){
                list.add(num);
            }
        }

        for(int j = 0; j<list.size();j++){
            System.out.print(list.get(j)+" ");
        }

        br.close();
        bw.flush();
        bw.close();
    }

}
