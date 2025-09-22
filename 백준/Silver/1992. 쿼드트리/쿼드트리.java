import java.io.*;

public class Main {
    static int [][] field;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();


        // 1. 입력 초기화
        int N = Integer.parseInt(br.readLine());
        field = new int [N][N];

        for (int r = 0; r < N; r++) {
            String line = br.readLine();
            for (int c = 0; c < N; c++) {
                field[r][c] = line.charAt(c) - '0';
            }
        }

        // 2. 단색 비교 시작
        compress(0,0,N,sb);

        // 출력
        System.out.println(sb);

        br.close();

    }

    // 단색 비교 함수
    static boolean isOneValue(int x, int y, int size){
        int first = field[y][x]; // 좌상단 값

        for(int i=y; i<y+size; i++){
            for(int j=x; j<x+size; j++){
                if(field[i][j]!=first){
                    return false; // 다른 값 발견
                }
            }
        }
        return true; // 전부 같음
    }

    // 쿼드트리 압축
    static void compress(int x, int y, int size, StringBuilder sb){
        if (size == 1) {
            sb.append(field[y][x]);
            return;
        }

        // 단일값이라면 필드값 넣기
        if(isOneValue(x,y,size)){
            sb.append(field[y][x]);
            return;
        }

        // 단일값이 아니라면 -> 재귀호출
        int half = size / 2;
        sb.append('(');
        compress(x,y,half,sb); // 좌상단
        compress(x+half,y,half,sb); // 우상단
        compress(x,y+half,half,sb); // 좌하단
        compress(x+half,y+half,half,sb); // 우하단
        sb.append(')');

    }
}
