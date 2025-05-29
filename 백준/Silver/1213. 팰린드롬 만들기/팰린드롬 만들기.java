import java.util.*;
import java.io.*;

public class Main{
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        

        int [] arr = new int[26];

        // 배열 초기화
        for(char c: str.toCharArray()){
            arr[c-'A']++;
        }

        // 팰린드롬이 가능한지 확인

        int count = 0;
        char center = 0;

        
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==1){
                count++;
                center = (char) (i+'A');
                arr[i] --;
            }
            
        }

        if(count>1){
            System.out.println("I'm Sorry Hansoo");
            return;
        }

        String pre ="", post="";

        int j=0;
        while(j<26){
            if(arr[j] !=0){
                pre += (char) (j+'A');
                arr[j] -=2;
            }

            if(arr[j] == 0){
                j++;
            }
        }

        for(int i=pre.length()-1;i>=0;i--){
        
            post += pre.charAt(i);
        }
        
        // 결과 출력
        
        if(count == 1){
            System.out.println(pre+center+post);
        }else{
            System.out.println(pre+post);
        }
        

        
        br.close();
    }

}