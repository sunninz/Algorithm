import java.io.*;
import java.util.*;

public class Main {

    static int N;
    static int[] tree;
    static boolean[] deleted;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 초기화
        N = Integer.parseInt(br.readLine());
        tree = new int[N];
        deleted = new boolean[N];

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
        deleted[removeNum] = true;

        for(int i = 0; i < N; i++){
            if(!deleted[i] && tree[i] == removeNum){
                remove(i);
            }
        }
    }

    private static int countLeaf(){
        int count = 0;

        for(int i = 0; i < N; i++){
            if(deleted[i]) continue;

            boolean isLeaf = true;
            for(int j = 0; j < N; j++){
                if(!deleted[j] && tree[j] == i){
                    isLeaf = false;
                    break;
                }
            }

            if(isLeaf) count++;
        }

        return count;
    }
}