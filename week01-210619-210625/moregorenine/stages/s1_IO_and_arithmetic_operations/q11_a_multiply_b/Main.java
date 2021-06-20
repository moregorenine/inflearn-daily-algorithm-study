package kr.boj.stages.s1_IO_and_arithmetic_operations.q11_a_multiply_b;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int number1 = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int number2 = Integer.parseInt(st.nextToken());
        int countTen = 1;
        int total = 0;

        printResult(number1, number2, countTen, total);

    }

    private static void printResult(int number1, int number2, int countTen, int total) {
        int digit = number2 % 10;
        int rest = number2 / 10;
        if (rest >= 0) {
            int result = number1 * digit;
            System.out.println(result);
            total += result * countTen;
            countTen = countTen * 10;
        }

        if (rest > 0) {
            printResult(number1, rest, countTen, total);
        } else {
            System.out.println(total);
        }
    }

}
