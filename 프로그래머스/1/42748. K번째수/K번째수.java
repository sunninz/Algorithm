import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int i=0; i<commands.length; i++){
            // 1. 배열 자르고 초기화
            int[] temp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            
            // 2. 정렬
            Arrays.sort(temp);
            
            // 3. k번째에 있는 수 담기
            answer[i] = temp[commands[i][2]-1];
            
        }
        return answer;
    }
}