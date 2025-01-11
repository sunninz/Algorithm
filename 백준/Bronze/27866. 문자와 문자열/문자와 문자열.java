import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter (System.out));

        String str = br.readLine();
        ArrayList <String> list = new ArrayList<>();
        for(String s: str.split("")){
           list.add(s);
        }
        int num = Integer.parseInt(br.readLine());


        System.out.println(list.get(num-1));


        br.close();
        bw.flush();
        bw.close();
    }


}
