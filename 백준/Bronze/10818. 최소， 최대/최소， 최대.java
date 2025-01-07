import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        ArrayList<Integer> list = new ArrayList<>();


        for(int i = 0; i < n; i++){

            int num = Integer.parseInt(st.nextToken());
            list.add(num);

        }

        int max = list.get(0);
        int min = list.get(0);
        for(int j = 0; j < list.size();j++){
            if(max < list.get(j)){
                max = list.get(j);
            } else if(min > list.get(j)){
                min = list.get(j);
            } else{
                continue;
            }

        }

        System.out.print(min +" "+ max);

        br.close();
        bw.flush();
        bw.close();
    }

}
