import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //StringTokenizer st = new StringTokenizer(br.readLine(),"");
        ArrayList <Character> list = new ArrayList<>();
        String str = br.readLine();
        for(String s:str.split("")){
            list.add(s.charAt(0));

        }

        /**
         *  level
         *  5/2 +1 = 3
         *  3-1 & 3-5
         *  -> (n/2 + 1) - i의 절대값이 같은 두 위치의 글자가 같아야함
         */
        boolean palindrome =true;
        int length = list.size();
        for(int i=0;i < length/2;i++){

            if(list.get(i)==list.get(length-1-i)){
                palindrome = true;
            }else{
                palindrome = false;
                break;
            }
        }
        if(palindrome){
            System.out.println(1);
        }else{
            System.out.println(0);
        }

        br.close();
    }

}
