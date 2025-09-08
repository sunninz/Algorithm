import java.util.*;
import java.io.*;

public class Main {

    static int [][] field;
    static boolean [][] visited;
    static int [] dx = {0,0,-1,1};
    static int [] dy = {1,-1,0,0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        // 넓이를 담을 정답 배열
        ArrayList<Integer> ans = new ArrayList<>();

        // 초기화
        field = new int[N][M];
        visited = new boolean[N][M];

        for(int i=0; i<K; i++){
            st = new StringTokenizer(br.readLine());
            int start_x = Integer.parseInt(st.nextToken());
            int start_y = Integer.parseInt(st.nextToken());
            int end_x = Integer.parseInt(st.nextToken());
            int end_y = Integer.parseInt(st.nextToken());

            for(int y=start_y; y<end_y; y++){
                for(int x=start_x; x<end_x; x++){
                    field[y][x] = 1;
                }
            }
        }

        int area; // 컴포넌트의 넓이
        int count = 0; // 컴포넌트 개수
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                // field값0 & 방문X -> bfs
                if(field[i][j] == 0 && !visited[i][j]){
                    area = bfs(i,j,N,M);
                    ans.add(area);
                    count++;
                }
            }
        }

        bw.write(count+"\n");
        
        Collections.sort(ans); // 정렬
        for(int i=0;i<ans.size();i++){
            bw.write(ans.get(i)+ " ");
        }

        br.close();
        bw.flush();
        bw.close();

    }

    static int bfs(int p1, int p2, int n, int m){
        Queue<int[]> q = new LinkedList<>();
        int area = 0;

        q.add(new int[] {p1,p2});
        visited[p1][p2] = true;

        while(!q.isEmpty()){
            int[] curr = q.poll();
            int x = curr[0];
            int y = curr[1];

            area ++; // 영역을 방문할 때마다 1씩 증가

            for(int i=0; i<4; i++){
                int nx = x + dx[i];
                int ny = y + dy[i];
                if(nx>=0 && ny>=0 && nx<n && ny<m){
                    if(!visited[nx][ny] && field[nx][ny] == 0){
                        q.add(new int[] {nx,ny});
                        visited[nx][ny] = true;
                    }
                }
            }
        }
        return area;
    }
}
