import java.util.*;
import java.io.*;

public class Main {
	
	static int N,M;
	static int result;
	static int [][] map;
	
	static ArrayList<int[]> empty = new ArrayList<>();
	static ArrayList<int[]> virus = new ArrayList<>();
	
	static int [] dx = {-1,1,0,0};
	static int [] dy = {0,0,-1,1};
	
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		// 초기화 
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		map = new int[N][M];
		
		for(int i=0; i<N;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0;j<M;j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
				
				// 빈틈 & 바이러스 모으기 
				if(map[i][j] == 0) empty.add(new int[] {i,j});
				else if(map[i][j] == 2) virus.add(new int[] {i,j});
			}
		}
		
		// 백트래킹 시작
		backtracking(0,0);
		
		bw.write(result+"\n");
		
		bw.flush();
		bw.close();
		br.close();
		
	}
	
	// 벽을 세우는 3개 위치 뽑기
	static void backtracking(int depth, int startIdx) {
		// 종료조건 depth == 3 -> 시뮬레이션 
		if(depth == 3) {
			result = Math.max(result, simulation());
			return;
		}
		
		// 벽 탐색 
		for(int i=startIdx;i<empty.size();i++) {
			int[] pos = empty.get(i);
			
			// 벽 세우기
			map[pos[0]][pos[1]] = 1;
			
			// 다음 벽 탐색
			backtracking(depth+1, i+1);
			
			//복구
			map[pos[0]][pos[1]] = 0;
		}
		
		
	}
	
	// 시뮬레이션으로 바이러스 확산시키기
	static int simulation() {
		// 시뮬레이션 돌릴 임시 맵 
		int[][] temp = new int[N][M];
		
		for(int i=0; i<N;i++) {
			temp[i] = map[i].clone();
				
		}
		
		// 바이러스 확산시키기
		Queue<int[]> q = new LinkedList<>();
		
		// 초기 바이러스 큐에 넣기
		for(int i=0; i<virus.size();i++) {
			q.add(virus.get(i));
		}
		
		// 큐에서 꺼내서 확산시키기
		while(!q.isEmpty()) {
			int[] curr = q.poll();
			int x = curr[0];
			int y = curr[1];
			for(int i=0;i<4;i++) {
				int nx = dx[i]+x;
				int ny = dy[i]+y;
				
				// 벽은 넘기
				if(nx>=N || nx<0 || ny>=M || ny <0) continue;
				
				// 벽이 아니면 바이러스 확산
				if(temp[nx][ny] == 0) {
					temp[nx][ny] = 2;
					q.add(new int[] {nx,ny});
				}
			}
		}
		
		// 안전 구역 세기
		int count = 0;
		for(int i=0; i<N;i++) {
			for(int j=0;j<M;j++) {
				if(temp[i][j] == 0) count++;
			}
		}
		
		return count;
	}
    
}
