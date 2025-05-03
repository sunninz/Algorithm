import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] argss) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int [] arr = new int[9];
        int sum = 0;

        // 배열 초기화 & 합 구하기기
        for (int i=0;i<9;i++){
            int number = Integer.parseInt(br.readLine());
            arr[i] = number;
            sum += number;
        }

        // 합이 value와 같다면 -1로 변경
        int value = sum - 100;
        int a = 0,b = 0;
        outer:
            for(int i=0;i<8;i++){
                for(int j=i+1;j<9;j++){
                    if(arr[i] + arr[j] == value){
                        a = arr[i];
                        b = arr[j];
                        break outer;
                    }
                }
            }
        
        // 오름차순 정렬
        Arrays.sort(arr);

        // 두 수 제외하고 출력
        for(int i=0;i<9;i++){
            if(arr[i]!= a && arr[i] != b){
                System.out.println(arr[i]);
            }
        }


        br.close();
        bw.flush();
        bw.close();
    }


}
