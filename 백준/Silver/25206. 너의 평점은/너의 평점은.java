import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // (학점 × 과목평점 합) / 학점 총합



        double gradeScore = 0;
        double creditSum = 0;

        for(int i = 0; i < 20; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String subject = st.nextToken();
            double credit = Double.parseDouble(st.nextToken());
            String grade = st.nextToken();



            switch(grade){
                case "A+":
                    gradeScore += (double) (credit)* 4.5;
                    creditSum += credit;
                    break;
                case "A0":
                    gradeScore += (double) (credit)* 4.0;
                    creditSum += credit;
                    break;
                case "B+":
                    gradeScore += (double) (credit)* 3.5;
                    creditSum += credit;
                    break;
                case "B0":
                    gradeScore += (double) (credit)* 3.0;
                    creditSum += credit;
                    break;
                case "C+":
                    gradeScore += (double) (credit)* 2.5;
                    creditSum += credit;
                    break;
                case "C0":
                    gradeScore += (double) (credit)* 2.0;
                    creditSum += credit;
                    break;
                case "D+":
                    gradeScore += (double) (credit)* 1.5;
                    creditSum += credit;
                    break;
                case "D0":
                    gradeScore += (double) (credit)* 1.0;
                    creditSum += credit;
                    break;
                case "F":
                    creditSum += credit;
                    break;
                default:



            }
        }
        double score = gradeScore / creditSum;
        System.out.println(score);

        br.close();
    }

}
