import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        
        String [] strs = new String[numbers.length];
        
        // 1. 형변환 (int -> String)
        for(int i=0; i<numbers.length; i++){
            strs[i] = String.valueOf(numbers[i]);
        }
        
        // 2. a+b 와 b+a 중 더 큰 쪽이 앞에 오도록 정렬
        Arrays.sort(strs, (a,b) -> (b+a).compareTo(a+b));
        
        // 3. 이어붙이기
        for(int i=0; i< strs.length; i++){
            answer += strs[i];
        }
        
        // 4. 모두 0일 경우
        if(strs[0].equals("0")){
            return "0";
        }
        return answer;
    }
}