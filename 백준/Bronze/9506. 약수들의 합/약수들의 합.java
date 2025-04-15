import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        while(true){
            int sum=0;
            int n = Integer.parseInt(br.readLine());

            if(n==-1) break;
            ArrayList <Integer> list = new ArrayList<>();

            for(int i=1;i<n;i++){
                if(n%i==0) {
                    list.add(i);
                    sum+=i;
                }
                else{
                    continue;
                }
            }
            if(sum==n){
                bw.write(n+" = ");
                bw.write(list.get(0)+" + ");

                for(int j=1;j<list.size()-1;j++){
                    bw.write(list.get(j)+" + ");
                }

                bw.write(list.get(list.size()-1)+"\n");
                
            }else{
                bw.write(n+ " is NOT perfect.\n");
            }
            
        }
        bw.flush();
        bw.close();
        br.close();
    }
}