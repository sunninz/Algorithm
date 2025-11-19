import java.io.*;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true) {
            String str = br.readLine();

            if(str.equals(".")) {
                break;
            }
            Stack<Character> stack = new Stack<>();
            char[] list = str.toCharArray();

            boolean flag = true;

            for (int j = 0; j < list.length; j++) {
                if(list[j] == '('){ // 소괄호
                    stack.push(list[j]);
                }
                else if(list[j] == ')'){
                    if(!stack.isEmpty() && stack.peek() == '(') {
                        stack.pop();
                    } else{
                        flag = false;
                        break;
                    }
                }
                else if(list[j] == '['){ // 대괄호
                    stack.push(list[j]);
                }
                else if(list[j] == ']'){
                    if(!stack.isEmpty() && stack.peek() == '[') {
                        stack.pop();
                    } else{
                        flag = false;
                        break;
                    }
                }
            }

            if(stack.isEmpty() && flag){
                bw.write("yes\n");
            } else {
                bw.write("no\n");
            }

        }

        bw.flush();
        bw.close();
        br.close();

    }

}
