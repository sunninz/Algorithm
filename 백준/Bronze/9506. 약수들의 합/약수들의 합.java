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

            for(int i=1;i<=n/2;i++){
                if(n%i==0) {
                    list.add(i);
                    sum+=i;
                }
            }


            if(sum==n){
                bw.write(n+" = ");
                
                for(int j=0;j<list.size();j++){
                    bw.write(list.get(j)+"");
                    if(j<list.size()-1){
                        bw.write(" + ");
                    }
                }
                bw.newLine();
                
            }else{
                bw.write(n+ " is NOT perfect.\n");
            }
            
        }
        bw.flush();
        bw.close();
        br.close();
    }
}