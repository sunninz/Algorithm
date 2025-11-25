import java.util.*;

class Solution {
    public int solution(int[] nums) {
        
        int count = 0;
        
        // 합 구하기
        ArrayList<Integer> arr = new ArrayList<>();
        
        for(int i=0; i<nums.length-2; i++){
            for(int j=i+1; j< nums.length-1; j++){
                for(int k=j+1; k<nums.length; k++){
                    int result = nums[i] + nums[j] + nums[k];
                    arr.add(result);
                }
            }
        }
        
        // 소수인지 검증
        for(int i=0; i<arr.size(); i++){
            int sum = arr.get(i);
            
            boolean flag = true;
            for(int j=2; j<sum; j++){
                if(sum%j == 0){
                    flag = false;
                }
            }
            
            if(flag){
                count++;
            }
        }
        
        return count;
    }
}