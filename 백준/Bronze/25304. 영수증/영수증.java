import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int n = sc.nextInt();
        int result = 0;
        
        for(int i=1;i<=n;i++){
            int price = sc.nextInt();
            int num = sc.nextInt();
            result += (price * num);
        }
        
        if(result == total){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
