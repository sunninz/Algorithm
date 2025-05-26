import java.util.*;
import java.io.*;

public class Main{
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();

        ArrayList<Integer> list = new ArrayList<>();

        for(char c : str.toCharArray()){
    

            if((int)c >= 'A' + 13 & (int)c < 'a'){
                list.add((int)c-13);
            }
            else if ((int)c < 'A' + 13 & (int)c >='A'){
                list.add((int)c+13);
            }
            else if ((int)c >= (int)'a' + 13 & (int)c <= 'z'){
                list.add((int)c-13);
            }
            else if ((int)c <'a' + 13 & (int)c >'A'){
                list.add((int)c+13);
            }
            else{
                list.add((int)c);
            }
        }

        for(int j=0;j<list.size();j++){
            bw.write((char)(int)(list.get(j))+"");
        }

    
        bw.flush();
        br.close();
        bw.close();
    }

}