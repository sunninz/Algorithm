import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 입력 받기 h:행, w:열
        int h = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());

        // 배열 초기화
        int[][] result = new int[h][w];



        for (int i = 0; i < h; i++) {
            String line = br.readLine();

            int time = -1; // 현재 위치까지 걸린 시간

            for (int j = 0; j < w; j++) {
                if(line.charAt(j) == 'c') {
                    // 구름을 만남
                    result[i][j] = 0;
                    time = 1;
                } else{
                    if(time == -1) {
                        // 이전에 구름을 만나지 않았을 경우
                        result[i][j] = -1;
                    }
                    else{
                        // 이전에 구름을 만난 경우
                        result[i][j] = time;
                        time++;

                    }

                }
            }
        }

        // 출력
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }

        br.close();

    }

}
