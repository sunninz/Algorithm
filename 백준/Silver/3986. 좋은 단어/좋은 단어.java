import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 초기화
        int n = Integer.parseInt(br.readLine());
        int count = 0;

        for(int i=0;i<n;i++){
            String str = br.readLine();

            if(goodWord(str)){
                count++;
            }
        }

        System.out.println(count);
    }

    public static boolean goodWord(String str){

        Stack<Character> stack = new Stack<>();

        for(char c:str.toCharArray()){
            // top과 현재 문자가 같으면 pop
            if(!stack.empty() && stack.peek() == c){
                stack.pop();
            }
            else{
                // top과 문자가 다르다면 스택에 push
                stack.push(c);
            }
        }
        
        return stack.isEmpty();
    }
}