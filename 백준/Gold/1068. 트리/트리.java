import java.io.*;
import java.util.*;

public class Main {

    static int N;
    static int[] tree;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 초기화
        N = Integer.parseInt(br.readLine());
        tree = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            tree[i] = Integer.parseInt(st.nextToken());
        }

        int removeNum = Integer.parseInt(br.readLine());

        remove(removeNum);

        int count = countLeaf();

        bw.write(count+"\n");

        bw.flush();
        bw.close();
        br.close();

    }

    /**
     * 노드 지우기
     * 해당 노드의 인덱스를 100으로 지정
     * 해당 노드의 값(removeNum)을 값으로 가지는 인덱스의 값을 100으로 지정
     */
    private static void remove(int removeNum) {

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(removeNum);

        while (!queue.isEmpty()) {
            int num = queue.poll();

            tree[num] = 100;

            for(int i = 0; i < N; i++){
                if(tree[i] == num && tree[i] != 100){
                    tree[i] = 100;
                    queue.offer(i);
                }
            }

        }
    }

    private static int countLeaf(){
        int count = 0;

        for(int i = 0; i < N; i++){
            if(tree[i] == 100){
                // 삭제된 노드임
                continue;
            }
            boolean isLeaf = true;

            for(int j = 0; j < N; j++){
                // 나를 부모로 두는 다른 노드가 있음
                if(tree[j] == i && tree[j] != 100){
                    isLeaf = false;
                    break;
                }
            }

            if(isLeaf){
                count++;
            }
        }

        return count;
    }
}