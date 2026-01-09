import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        HashMap <String,Integer> map = new HashMap<>();
        
        // 참여자 등록 (participant:count)
        for(String p : participant){
            map.put(p, map.getOrDefault(p,0) + 1);
        }
        
        // 완주자 제거: 맵에서 value - 1
        for(String c : completion){
            map.put(c, map.get(c)-1);
        }
        
        // 완주하지 못한 선수 찾기: entrySet 순회 -> value가 1이상인 key
        String answer = "";
        for(Map.Entry<String,Integer> entry: map.entrySet()){
            if(entry.getValue() >= 1){
                answer = entry.getKey();
                break;
            }
        }
        
        return answer;
    }
}