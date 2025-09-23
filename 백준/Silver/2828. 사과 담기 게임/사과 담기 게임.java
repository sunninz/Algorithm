import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int J = Integer.parseInt(br.readLine());

        // 이동거리
        int result = 0;

        // 바구니의 head tail
        int head = 1;
        int tail = head + M - 1;

        for (int i = 0; i < J; i++) {
            int pos = Integer.parseInt(br.readLine());

            if(pos >= head && pos <= tail) { // 1. 바구니 내부
                continue;
            }
            else if(pos < head) { // 2. 바구니의 왼쪽
                int move = head - pos;
                result += move;
                // 바구니 이동
                head = pos;
                tail = head + M - 1;
            }
            else{ // 3. 바구니의 오른쪽
                int move = pos - tail;
                result += move;
                // 바구니 이동
                tail = pos;
                head = tail - M + 1;
            }
        }
        System.out.println(result);

        br.close();

    }
    
}
