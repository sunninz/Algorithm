import java.io.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        // 정답 배열
        ArrayList<BigInteger> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            StringBuilder sb = new StringBuilder();

            // 숫자 붙이기
            for(int j=0;j<line.length();j++){
                char c = line.charAt(j);
                if(c >= '0'  && c <= '9'){
                    // 숫자
                    sb.append(c);
                } else{
                    // 문자가 나오면 지금까지 나온거 저장
                    if(sb.length()>0){
                        list.add(new BigInteger(sb.toString()));
                        sb.setLength(0); // sb 초기화
                    }
                }
            }
            if(sb.length()>0){
                // 마지막 끝에 있는 숫자 추가
                list.add(new BigInteger(sb.toString()));
            }
        }

        // 정렬
        Collections.sort(list);

        // 출력
        for(BigInteger num:list){
            System.out.println(num);
        }

        br.close();

    }

}
