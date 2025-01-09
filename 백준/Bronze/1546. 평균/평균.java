import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter (System.out));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        double [] score = new double[n];
        double max = 0;

        for (int i = 0; i < n; i++){
            score[i] = Double.parseDouble(st.nextToken());
            if(score[i] > max){
                max = score[i];
            }
        }

        for(int j =0; j < n; j++){
            score[j] = score[j]/max * 100;
        }

        double avg = 0;
        double sum = 0;
        for(int j =0; j < n; j++){
            sum += score[j];

        }
         avg = sum / score.length;

        System.out.println(avg);



        br.close();
        bw.flush();
        bw.close();
    }


}
