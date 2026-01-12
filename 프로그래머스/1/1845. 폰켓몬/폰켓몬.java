import java.util.*;
class Solution {
    public int solution(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        
        // 초기화 (종류 번호)
        for(Integer n : nums){
            set.add(n);
        }
        
        // 종류의 최댓값 찾기
        int answer = 0;
        answer = Math.min(set.size(), nums.length/2);
        
        return answer;
    }
}