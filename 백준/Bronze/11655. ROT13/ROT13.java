import java.util.*;
import java.io.*;

public class Main{
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();

        for(char c : str.toCharArray()){
    
            if((int)c >= 'A' + 13 & (int)c < 'a'){
                bw.write((char)(c-13)+"");
            }
            else if ((int)c < 'A' + 13 & (int)c >='A'){
                bw.write((char)(c+13)+"");
            }
            else if ((int)c >= (int)'a' + 13 & (int)c <= 'z'){
                bw.write((char)(c-13)+"");
            }
            else if ((int)c <'a' + 13 & (int)c >'A'){
                bw.write((char)(c+13)+"");
            }
            else{
                bw.write(c+"");
            }
        }

    
        bw.flush();
        br.close();
        bw.close();
    }

}