import java.io.*;
import java.util.*;

public class Main {

    static int N,M;
    static int [][] map;
    static boolean [][] air;

    static int hours; // 전체 시간
    static int lastCheese; // 마지막 1시간 전에 남은 치즈 수
    // 상하좌우
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        // 초기화
        map = new int[N][M];
        air = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        while (true) {

            // 1. 치즈 개수 세기
            int cheese = countCheese();

            if (cheese == 0) break; // 종료 조건

            lastCheese = cheese; // 종료 직전 치즈 개수 업데이트
            hours ++;

            // 2. 다시 외부 공기 찾기
            air = new boolean[N][M];
            bfs();

            // 3. 치즈 녹이기
            meltCheese();
        }

        bw.write(hours+"\n");
        bw.write(lastCheese +"\n");

        bw.flush();
        bw.close();
        br.close();

    }

    /**
     * 외부 공기 찾기
     */
    public static void bfs(){

        Queue<int[]> q = new LinkedList<>();
        // 시작 위치 (0,0)
        q.offer(new int[]{0,0});
        air[0][0] = true;

        while (!q.isEmpty()){
            int [] cur = q.poll();

            for(int i = 0;i<4;i++){
                int nx = cur[0]+dx[i];
                int ny = cur[1]+dy[i];

                if(nx>=0 && ny>=0 && nx<N && ny<M){
                    // map은 0인데 도달가능한 구역 = 외부공기
                    if(map[nx][ny]==0 && !air[nx][ny]){
                        air[nx][ny] = true;
                        q.offer(new int[]{nx,ny});
                    }
                }
            }
        }
    }

    /**
     * 치즈 녹이기
     */
    public static void meltCheese(){
        List<int[]> meltList = new ArrayList<>();

        // 외부 공기와 닿아있는 치즈 영역
        for(int i = 0;i<N;i++){
            for(int j = 0;j<M;j++){
                if(map[i][j]==1){
                    if(meltingArea(i,j)){
                        meltList.add(new int[]{i,j});
                    }
                }
            }
        }

        // 녹이기
        for(int i = 0;i<meltList.size();i++){
            map[meltList.get(i)[0]][meltList.get(i)[1]] = 0;
        }

    }

    /**
     * 외부와 닿아있는 치즈 영역인지 검증하기
     * @param i
     * @param j
     * @return true -> 외부가 닿아있는 영역
     */
    public static boolean meltingArea(int i,int j){
        // 상하좌우로 경계가 외부공기인지 탐색
        for(int k = 0;k<4;k++){
            int nx = i+dx[k];
            int ny = j+dy[k];

            if(nx>=0 && ny>=0 && nx<N && ny<M){ // 경계 검증
                if(air[nx][ny]) return true; // air == true일 경우
            }
        }
        return false;
    }

    /**
     * 치즈 개수 세기
     */
    public static int countCheese(){
        int cnt = 0;
        for(int i = 0;i<N;i++){
            for(int j = 0;j<M;j++){
                if(map[i][j]==1){
                    cnt++;
                }
            }
        }
        return cnt;
    }

}
