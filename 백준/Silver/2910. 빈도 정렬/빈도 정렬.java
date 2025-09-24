import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int length = Integer.parseInt(st.nextToken());
        int maxValue = Integer.parseInt(st.nextToken());

        // 1. 초기화 -> linked hash map
        st = new StringTokenizer(br.readLine());
        HashMap<Integer, Integer> map = new LinkedHashMap<>(); // key = number & value = count

        for (int i = 0; i < length; i++) {
            int current = Integer.parseInt(st.nextToken());
            map.put(current, map.getOrDefault(current, 0) + 1);
        }



        // 2. 정렬
        // 2-1. 숫자들 리스트 (고유 숫자 목록 -> 최소 등장 순서로 저장됨)
        List<Integer> list = new ArrayList<>(map.keySet());
        // 2-2. 빈도기반 재정렬 -> 내림차순
        /**
         * a,b: 장렬 순서를 결정하는 비교자
         * Integer.compare(map.get(b), map.get(a)): 오름차순 정렬
         * 첫번째 인수가 작으면 음수 반환
         * 같으면 0 반환
         * 첫번째 인수가 크면 양수 반환
         *
         * b,a의 위치를 바꿔서 내림차순 정렬
         */
        list.sort((a, b) -> Integer.compare(map.get(b), map.get(a)));

        // 3. 출력
        StringBuilder sb = new StringBuilder();
        for(Integer key : list){
            int cnt = map.get(key);
            for(int i = 0; i < cnt; i++){
                sb.append(key);
                sb.append(" ");
            }
        }
        System.out.println(sb.toString().trim());

        br.close();

    }

}
