package baekjoon.step3_for.q4_15552;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int loop = Integer.parseInt(br.readLine());
            showSum(br, loop);
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        } finally {
            br.close();
        }

    }

    private static void showSum(BufferedReader br, int loop) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));   //할당된 버퍼에 값 넣어주기
        try {
            for (int i = 0; i < loop; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine(), " ");
                bw.write(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()) + "\n");
            }
            bw.flush();
        } finally {
            bw.close();
        }
    }

}
