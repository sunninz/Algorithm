import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] numbers = new int[n];
        int count = 0;

        for (int i = 0; i < n; i++){
            int num = sc.nextInt();
            numbers[i] =num;
        }
        int find = sc.nextInt();

        for (int i = 0; i < n; i++){

            if(find == numbers[i]){
                count += 1;
            }
        }

        System.out.println(count);
    }

}
