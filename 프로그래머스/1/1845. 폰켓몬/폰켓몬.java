import java.util.*;
class Solution {
    public int solution(int[] nums) {
        HashMap <Integer, Integer> map = new HashMap<>();
        
        // 초기화 (종류 번호, count)
        for(Integer n : nums){
            map.put(n, map.getOrDefault(n,0) + 1);
        }
        
        // 종류의 최댓값 찾기
        int answer = 0;
        answer = Math.min(map.size(), nums.length/2);
        
        return answer;
    }
}