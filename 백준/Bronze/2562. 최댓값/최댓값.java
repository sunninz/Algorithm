import java.util.*;
import java.io.*;

public class Main {
    public static void main (String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> list = new ArrayList<>(9);
        int max = 0;
        for(int i = 0; i < 9; i++){
            int num = Integer.parseInt(br.readLine());
            list.add(num);
            max = Math.max(max,num);
        }

        int index = 0;
        for(int j = 0; j < 9; j++){
            if(list.get(j) == max) {
                index = j + 1;
            }
        }

        System.out.println(max);
        System.out.println(index);

        br.close();
    }


}
