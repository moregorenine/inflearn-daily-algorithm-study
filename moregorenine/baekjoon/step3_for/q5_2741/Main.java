package baekjoon.step3_for.q5_2741;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int count = Integer.parseInt(br.readLine());
            printUntilNumber(count);
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        } finally {
            br.close();
        }

    }

    private static void printUntilNumber(int count) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        try {
            for (int i = 1; i <= count; i++) {
                bw.write(i + "\n");
            }
            bw.flush();
        } finally {
            bw.close();
        }
    }

}
