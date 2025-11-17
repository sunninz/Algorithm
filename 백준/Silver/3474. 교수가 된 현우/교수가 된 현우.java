import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());


        for (int i = 0; i < t; i++) {
            int fiveCount = 0;
            int twoCount = 0;

            int n = Integer.parseInt(br.readLine());

            for (int j = 2; j <= n; j*=2) {
                twoCount += n/j;
            }
            for (int j = 5; j <= n; j*=5) {
                fiveCount += n/j;
            }

            bw.write(Math.min(fiveCount, twoCount) + "\n");

        }

        bw.flush();
        bw.close();
        br.close();

    }

}
