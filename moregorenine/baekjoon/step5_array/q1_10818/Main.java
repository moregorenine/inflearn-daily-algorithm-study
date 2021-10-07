package baekjoon.step5_array.q1_10818;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int count = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int current = Integer.parseInt(st.nextToken());
            int min = current, max = current;
            while (st.hasMoreTokens()) {
                current = Integer.parseInt(st.nextToken());
                if (current > max) {
                    max = current;
                }
                if (current < min) {
                    min = current;
                }
            }
            System.out.printf("%d %d", min, max);
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        } finally {
            br.close();
        }

    }

}
