import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter (System.out));

        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0;
        String str = br.readLine();
        for(String s:str.split("")){
            int int_s = Integer.parseInt(s);
            list.add(int_s);

        }
        for (int i = 0;i < list.size(); i++){
            sum += list.get(i);
        }

        System.out.println(sum);


        br.close();
        bw.flush();
        bw.close();
    }


}
