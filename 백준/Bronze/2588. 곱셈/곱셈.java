import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        int b =sc.nextInt();
        int r1 = b % 10; //r1=5
        int r2 = (b-r1)%100; //r2 = 80
        int r3 = b-r2-r1; //r3 = 300
        int result1 = a * r1;
        int result2 = a * r2;
        int result3 = a * r3;
        System.out.println(result1);
        System.out.println(result2/10);
        System.out.println(result3/100);
        System.out.println(result1+result2+result3);
    }
}

