import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter (System.out));


        ArrayList <Integer> list = new ArrayList<>();

        for(int i = 1; i <= 30; i++){
            list.add(i);
        }


        for (int j = 0; j < 28; j++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());

            list.remove(Integer.valueOf(num));
            
        }

        for (int k = 0; k <list.size(); k++){
            System.out.println(list.get(k));
        }

        br.close();
        bw.flush();
        bw.close();
    }


}
