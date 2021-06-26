package baekjoon.step3_for.q1_2739;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int number = Integer.parseInt(st.nextToken());

        displayMultiplicationTable(number, 9);
    }

    private static void displayMultiplicationTable(int number, int count) {
        for (int i = 1; i <= count; i++) {
            System.out.printf("%d * %d = %d\n", number, i, number * i);
        }
    }

}
