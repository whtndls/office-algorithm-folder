package SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 문자열 옮기기
public class SWEA22979 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int tc = Integer.parseInt(st.nextToken());
        for (int t = 0; t < tc; t++) {
            st = new StringTokenizer(br.readLine());
            char[] input = st.nextToken().toCharArray();

            st = new StringTokenizer(br.readLine());
            int k = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            int[] cnt = new int[k];
            for (int i = 0; i < k; i++)
                cnt[i] = Integer.parseInt(st.nextToken());

            int index = 0;
            for (int i = 0; i < k; i++) {
                index = (index + cnt[i]) % input.length;
                if (index < 0) index += input.length;
            }

            for (int i = 0; i < input.length; i++)
                sb.append(input[(index + i) % input.length]);
            System.out.println(sb);
            sb.setLength(0);
        }
    }
}
