import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        
        int minute = h*60 + m;
        minute -=45;
        if(minute<0){
            minute +=24*60;
        }
        
        h=minute/60;
        m=minute%60;
        System.out.println(h+" "+m);
        
    }
}