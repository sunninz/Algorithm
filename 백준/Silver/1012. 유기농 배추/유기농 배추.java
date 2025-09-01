import java.util.*;
import java.io.*;

public class Main {

    // 상하좌우방향 탐색
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());

        for(int i=0;i<num;i++){
            // 초기화
            StringTokenizer st = new StringTokenizer(br.readLine());
            int cols = Integer.parseInt(st.nextToken()); // 가로
            int rows = Integer.parseInt(st.nextToken()); // 세로
            int seed = Integer.parseInt(st.nextToken()); // 배추개수
            int [][] field = new int[cols][rows];
            boolean[][] visited = new boolean[cols][rows];

            for(int j=0;j<seed;j++){
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                field[x][y] = 1;
            }

            int count = 0; //지렁이 수

            // 탐색
            for(int j=0;j<cols;j++){
                for(int k=0;k<rows;k++){
                    // 방문하지 않은 배추 -> bfs 탐색
                    if(field[j][k]==1 && !visited[j][k]){
                        bfs(j, k, field, visited, cols, rows);
                        count++;
                    }
                }
            }

            bw.write(count+"\n");

        }

        br.close();
        bw.flush();
        bw.close();
    }

    static void bfs(int startX,int startY, int[][] maze, boolean[][]visited,int cols, int rows){
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[] {startX,startY});
        visited[startX][startY] = true;

        while(!q.isEmpty()){
            int[] current = q.poll();
            int x = current[0];
            int y = current[1];

            for(int i=0;i<4;i++){
                int nx = x + dx[i];
                int ny = y + dy[i];

                // field 범위 안 && 방문하지 않음 && 배추 -> 방문처리 & 큐에 대기
                if(nx>=0 && ny>=0 && nx<cols && ny<rows){
                    if(!visited[nx][ny] && maze[nx][ny]==1){
                        visited[nx][ny] = true;
                        q.add(new int[] {nx,ny});
                    }
                }
            }

            // while문 종료 -> 1개의 배추무리(컴포넌트) 발견 종료
        }
    }
}
