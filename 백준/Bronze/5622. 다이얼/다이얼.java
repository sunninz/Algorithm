import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();

        int time = 0;


        for(String s: str.split("")){
            switch(s.charAt(0)){
                case 'A': case 'B': case 'C':
                    time +=3;
                    break;
                case 'D': case 'E': case 'F':
                    time +=4;
                    break;
                case 'G': case 'H': case 'I':
                    time +=5;
                    break;
                case 'J': case 'K': case 'L':
                    time +=6;
                    break;
                case 'M': case 'N': case 'O':
                    time +=7;
                    break;
                case 'P': case 'Q': case 'R': case 'S':
                    time +=8;
                    break;
                case 'T': case 'U': case 'V':
                    time +=9;
                    break;
                case 'W': case 'X': case 'Y': case 'Z':
                    time +=10;
                    break;

            }



        }

        System.out.println(time);


        br.close();
        bw.flush();
        bw.close();
    }


}
