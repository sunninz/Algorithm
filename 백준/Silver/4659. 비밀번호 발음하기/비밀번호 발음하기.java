import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            String input = br.readLine();

            // 종료 조건 비교
            if(input.equals("end")){
                break;
            }

            // 입력 초기화
            char [] inputArray = input.toCharArray();
            boolean flag = true;

            // 1. 모음이 반드시 1개 포함
            boolean hasVowel = false;

            for(int i = 0; i < input.length(); i++){
                char c = inputArray[i];
                if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                    hasVowel = true;
                    break;
                }
            }

            if(!hasVowel){
                flag = false;
            }

            // 2. 모음 3개 or 자음 3개가 연속으로 오면 안됨
            for(int i = 0; i < input.length()-2 && flag; i++){
                int vowel = 0;
                int consonant = 0;
                for(int j = i; j < i+3; j++){
                    char c = inputArray[j];
                    if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                        vowel++;
                    }else{
                        consonant++;
                    }
                }
                if(vowel == 3 || consonant == 3){
                    flag = false;
                }
            }


            // 3. 같은 글자가 연속으로 두번 오면 안됨 (단, ee or oo는 허용)
            for(int i = 0; i < input.length()-1; i++){
                if(inputArray[i] == inputArray[i+1]){
                    if (inputArray[i] != 'e' && inputArray[i] != 'o') {
                        flag = false;
                    }
                }
            }

            // 출력
            if(flag){
                System.out.println("<"+input+"> is acceptable.");
            }else{
                System.out.println("<"+input+"> is not acceptable.");
            }

        }

        br.close();

    }

}
