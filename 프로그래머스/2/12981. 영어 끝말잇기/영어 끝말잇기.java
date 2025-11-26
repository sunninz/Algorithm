class Solution {
    
    static int[] answer = new int[2]; // 번호, 차례
    static int num = 2; // 번호
    static int turn = 1; // 몇 번째 차례 (바퀴수)
    static boolean finish = true; // 플래그
    
    public int[] solution(int n, String[] words) {
        
        
        // words에서 하나씩 검증
        for(int i=1; i<words.length; i++){
            
            char[] prev = words[i-1].toCharArray();
            char[] curr = words[i].toCharArray();
            
            // 끝말잇기 성공 유무 (이전 단어의 마지막 = 현재 단어의 첫번째)
            boolean wordChainSucceed = wordChain(prev,curr);
            
            // 이전에 말했던 단어인지
            boolean prevWordSucced = prevWord(i,words);
            
            // 성공 여부 확인
            if(wordChainSucceed && prevWordSucced){
                if(num == n){
                    // 마지막 사람이 대답 -> turn을 1증가 & num은 다시 1부터
                    turn++;
                    num = 1;
                } else{
                    num++;
                }
            } else {
                finish = false;
                answer[0] = num;
                answer[1] = turn;
                break;
            }
            
            
            
        }
        
        if(finish){
            answer[0] = 0;
            answer[1] = 0;
        }
        
        
        return answer;
    }
    
    private boolean wordChain(char[] prev, char[] curr){
        boolean flag=true;
        
        if(prev[prev.length-1] != curr[0]){
            flag = false;
        } 
        
        return flag;
    }
    
    
    private boolean prevWord (int num, String[] words){
        boolean flag=true;
        String word = words[num];
        
        for(int i = 0; i<num; i++){
            String curr = words[i];
            if(curr.equals(word)){
                flag = false;
                break;
            }
        }
        return flag;
    }
    
}