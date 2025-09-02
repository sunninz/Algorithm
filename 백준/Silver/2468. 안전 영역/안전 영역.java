import java.util.*;
import java.io.*;

public class Main {
    static int [][] field;
    static int[] dx = {0,0,-1,1};
    static int[] dy = {1,-1,0,0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        int maxHeight = 0; // 최대 높이
        field = new int[n][n]; // 초기화
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                field[i][j] = Integer.parseInt(st.nextToken());
                maxHeight = Math.max(maxHeight, field[i][j]);
            }
        }

        int maxCount = 0; // 최대 영역수
        for(int i=0;i<=maxHeight;i++){
            boolean [][] visited = new boolean[n][n];
            int count = 0;
            for(int j=0;j<n;j++){
                for(int k=0;k<n;k++){
                    // 물의 높이보다 높음 & 미방문 -> bfs로 같은 컴포넌트 방문 & count 증가
                    if(field[j][k] > i && !visited[j][k]){
                        bfs(j,k,n,i,visited);
                        count++;
                    }
                }
            }
            // 최대 영역수 업데이트
            maxCount = Math.max(maxCount,count);
        }
        System.out.println(maxCount);

        br.close();
        bw.flush();
        bw.close();

    }

    static void bfs (int p1, int p2, int n, int height, boolean[][] visited){
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{p1,p2});
        visited[p1][p2] = true;

        while(!q.isEmpty()){
            int[] curr = q.poll();
            int x = curr[0];
            int y = curr[1];

            for(int i=0;i<4;i++){
                int nx = x + dx[i];
                int ny = y + dy[i];
                if(nx>=0 && ny>=0 && nx<n && ny<n){
                    if(!visited[nx][ny] && field[nx][ny] > height){
                        visited[nx][ny] = true;
                        q.add(new int[]{nx,ny});
                    }
                }
            }
        }

    }

}
