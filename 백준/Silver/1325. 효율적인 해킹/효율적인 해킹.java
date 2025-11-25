import java.io.*;
import java.util.*;

public class Main {

    static int N;
    static int M;
    static ArrayList<Integer>[] arr;
    static int[] count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        count = new int[N+1];
        arr = new ArrayList[N+1];

        for (int i = 1; i <= N; i++) {
            arr[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            // 해킹 순서 B -> A
            arr[b].add(a);
        }

        for (int i = 1; i <= N; i++) {
            boolean[] visited = new boolean[N+1];
            Queue<Integer> q = new LinkedList<>();

            visited[i] = true;
            q.offer(i);

            int cnt = 1;

            while(!q.isEmpty()){
                int curr = q.poll();
                for(int next :  arr[curr]){
                    if(!visited[next]) {
                        visited[next] = true;
                        cnt++;
                        q.add(next);
                    }
                }
            }
            count[i]  = cnt;
        }

        // 최대값 찾기
        int max = 0;
        for (int i = 1; i <= N; i++) {
            max = Math.max(max, count[i]);
        }

        // 출력
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= N; i++) {
            if (count[i] == max) sb.append(i + " ");
        }

        System.out.println(sb.toString());

        br.close();

    }
}