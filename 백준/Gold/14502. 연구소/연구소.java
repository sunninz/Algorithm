import java.io.*;
import java.util.*;

public class Main {

    static int N,M;
    static int [][] map;
    static List<int[]> empty = new ArrayList<>(); // 빈칸 좌표 저장
    static List<int[]> virus = new ArrayList<>(); // 바이러스 출발점 리스트 BFS 시작 큐

    static int result; // 최대 안전 구역
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

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());

                if(map[i][j] == 0){
                    // 0이면 빈칸에 추가
                    empty.add(new int[]{i, j});
                }
                else if(map[i][j] == 2){
                    // 2면 BFS 시작점에 추가
                    virus.add(new int[]{i, j});
                }
            }
        }

        backTracking(0,0);

        bw.write(result+"\n");
        
        bw.flush();
        bw.close();
        br.close();

    }

    /**
     * 3개의 벽을 선택하는 과정
     * @param depth: 현재까지 세운 벽의 수 (0~3)
     * @param start: empty 리스트에서 이번 선택을 시작할 인덱스 (조합 중복 방지)
     */
    public static void backTracking(int depth, int start){
        if(depth == 3){
            // 현재 map을 기반으로 바이러스 확산 진행 -> 최대 안전 구역 갱신
            result = Math.max(result, simulate());
            return;
        }

        for(int i = start; i < empty.size(); i++){
            int[] pos = empty.get(i);

            // 벽을 세움
            map[pos[0]][pos[1]] = 1;

            // 다음 깊이로 진행
            backTracking(depth+1, i+1);

            // map은 원래대로 복구
            map[pos[0]][pos[1]] = 0;
        }
    }

    /**
     * 현재 map = 벽을 3개 설치한 상태
     * BFS로 바이러스 확산 -> 안전 구역 count
     *
     * @return 안전구역의 개수
     */
    public static int simulate(){

        // map 원본을 유지하기 위해 임시 map 생성
        int[][] temp = new int[N][M];

        for(int i = 0; i < N; i++){
            temp[i] = map[i].clone();
        }

        // 바이러스 확산
        Queue<int[]> q = new LinkedList<>();
        for(int[] v: virus){
            q.add(v);
        }

        // 큐가 빌 때까지 상하좌우로 바이러스 확산
        while(!q.isEmpty()){
            int[] curr = q.poll();
            int x = curr[0];
            int y = curr[1];
            for(int i = 0; i < 4; i++){
                int nx = x + dx[i];
                int ny = y + dy[i];
                if(nx >= 0 && nx < N && ny >= 0 && ny < M){
                    // 경계인지 확인
                    if(temp[nx][ny] == 0){
                        // 바이러스로 변경
                        temp[nx][ny] = 2;
                        // 새로 퍼진 곳은 다시 큐에 저장
                        q.add(new int[]{nx, ny});
                    }
                }
            }
        }

        // 확산 종료 -> 안전 구역 계산
        int safe = 0;
        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                if(temp[i][j] == 0){
                    safe++;
                }
            }
        }

        return safe;

    }
}
