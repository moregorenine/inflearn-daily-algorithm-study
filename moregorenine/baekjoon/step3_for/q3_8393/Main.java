package baekjoon.step3_for.q3_8393;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            int number = Integer.parseInt(br.readLine());
            showSum(number);
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        } finally {
            br.close();
        }

    }

    private static void showSum(int number) {
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        System.out.printf("%d", sum);
    }

}
