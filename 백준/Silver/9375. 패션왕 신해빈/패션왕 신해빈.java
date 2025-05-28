import java.util.*;
import java.io.*;

public class Main{
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());

        for(int i=0;i<n;i++){

            int m = Integer.parseInt(br.readLine());
            HashMap<String, Integer> map = new HashMap<String, Integer>();
            
            for(int j=0;j<m;j++){
                st = new StringTokenizer(br.readLine());

                String name = st.nextToken();
                String category = st.nextToken();
                
                map.put(category, map.getOrDefault(category, 0)+1);
            }

            int answer = 1;
            for(int count: map.values()){
                answer *= count+1;
            }
            
            System.out.println(answer-1);
        }
        
        br.close();
    }

}