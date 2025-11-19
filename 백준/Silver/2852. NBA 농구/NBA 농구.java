import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static int firstTime = 0;
    public static int secondTime = 0;
    public static int totalTime = 0; // 마지막 골 시간

    public static int firstScore = 0;
    public static int secondScore = 0;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        /**
         * 이기고 있는 시간 구하기
         * 매 골마다 score 비교 -> 이전 골과의 타임 슬롯을 나눠서 이기고 있는 팀의 socre에 더하기
         */

        int beforeGoalTime = 0; // 직전 골이 들어간 시간

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int goalTeam =  Integer.parseInt(st.nextToken());
            String[] goalTime = st.nextToken().split(":");

            beforeGoalTime = goal(beforeGoalTime,goalTeam, goalTime);
        }

        if(firstScore > secondScore){
             firstTime += 48*60 - totalTime;
        } else if(secondScore > firstScore){
            secondTime += 48*60 - totalTime;
        }

        System.out.println(String.format("%02d:%02d",firstTime/60,firstTime%60));
        System.out.println(String.format("%02d:%02d",secondTime/60,secondTime%60));

        bw.flush();
        bw.close();
        br.close();

    }

    static int goal(int beforeGoalTime,int goalTeam, String[] goalTime){

        int goalMinutes = Integer.parseInt(goalTime[0]);
        int goalSeconds = Integer.parseInt(goalTime[1]);

        int currentTime = goalMinutes * 60 + goalSeconds;

        // 이기는 시간 업데이트
        if(firstScore > secondScore){
            firstTime += currentTime - beforeGoalTime;
        } else if(secondScore > firstScore) {
            secondTime += currentTime - beforeGoalTime;
        }

        // score 업데이트
        if(goalTeam == 1){
            firstScore ++;
        } else if(goalTeam == 2){
            secondScore ++;
        }

        // 전체 시간 업데이트
        totalTime = currentTime;

        return currentTime;
    }

}
