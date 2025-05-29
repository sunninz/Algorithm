import java.util.*;
import java.io.*;

public class Main{
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        

        int [] arr = new int[26];

        // 알파벳 개수 카운트
        for(char c: str.toCharArray()){
            arr[c-'A']++;
        }

        // 홀수 개수 체크 및 중앙 문자 설정

        int count = 0;
        char center = 0;

        for(int i=0;i<26;i++){
            if(arr[i]%2==1){
                count++;
                center = (char) (i+'A');
                arr[i] --;
            }
            
        }

        // 팰린드롬 가능 여부 확인
        if(count>1){
            System.out.println("I'm Sorry Hansoo");
            return;
        }

        // 팰린드롬 만들기

        // 앞쪽 구성
        StringBuilder pre = new StringBuilder();

        for (int i = 0; i < 26; i++) { //알파벳 A~Z
            for (int j = 0; j < arr[i] / 2; j++) { // 알파벳의 개수 중 절만만큼 넣음
                pre.append((char)(i + 'A'));
            }
        }

        // 뒷쪽 구성
        StringBuilder post = new StringBuilder(pre).reverse();

        // 결과 출력
        if(count == 1){
            System.out.println(pre.toString()+center+post.toString());
        }else{
            System.out.println(pre.toString()+post.toString());
        }
        
        br.close();
    }

}