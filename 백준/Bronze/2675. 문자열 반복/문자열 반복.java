import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int time = Integer.parseInt(st.nextToken());
            String str = st.nextToken();


            for (String s : str.split("")) {

                for (int j = 0; j < time; j++) {
                    System.out.print(s);
                }

            }
            System.out.println();

        }
        br.close();
    }


}
