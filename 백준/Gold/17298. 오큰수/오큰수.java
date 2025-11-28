import java.io.*;
import java.util.*;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 초기화
        int N = Integer.parseInt(br.readLine());

        int []  arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 오큰수 찾기 (스택 = 오큰수를 찾기 못한 인덱스)
        Stack<Integer> stack = new Stack<>();

        int [] result = new int[N]; // 오큰수
        Arrays.fill(result, -1);

        stack.push(0);

        for(int i = 1; i < N; i++){
            while(!stack.isEmpty() && arr[i] > arr[stack.peek()]){
                result[stack.pop()] = arr[i] ;
            }
            stack.push(i);
        }

        for(int i = 0; i < N; i++){
            bw.write(result[i] + " ");
        }

        bw.flush();
        bw.close();
        br.close();
    }

}