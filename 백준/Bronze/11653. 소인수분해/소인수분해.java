import java.util.*;
import java.io.*;

public class Main{
    public static ArrayList<Integer> prime;
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());


        ArrayList<Integer> list = new ArrayList<>(); // 소인수 분해한 수를 담을 arraylist

        int mod=n;
        int i=2;

        while(mod>1){
            if(mod%i==0) {
                list.add(i);
                mod = mod/i;
                bw.write(i+"\n");
            }
            else{
                i++;
            }
            
        }

        br.close();
        bw.flush();
        bw.close();
    }


}