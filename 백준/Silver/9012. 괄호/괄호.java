import java.io.*;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            String str = br.readLine();

            Stack<Character> stack = new Stack<>();
            char[] list = str.toCharArray();

            boolean flag = true;

            for (int j = 0; j < list.length; j++) {
                if(list[j] == '('){
                    stack.push(list[j]);
                } else if(list[j] == ')'){
                    if(stack.isEmpty()){
                        flag = false;
                        break;
                    }
                    stack.pop();
                }
            }

            if(stack.isEmpty() && flag){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }

        bw.flush();
        bw.close();
        br.close();

    }

}
