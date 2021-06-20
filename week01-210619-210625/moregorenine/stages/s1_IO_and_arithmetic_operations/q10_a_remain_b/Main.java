package kr.boj.stages.s1_IO_and_arithmetic_operations.q10_a_remain_b;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int number1 = Integer.parseInt(st.nextToken());
        int number2 = Integer.parseInt(st.nextToken());
        int number3 = Integer.parseInt(st.nextToken());

        System.out.println((number1 + number2) % number3);
        System.out.println(((number1 % number3) + (number2 % number3)) % number3);
        System.out.println((number1 * number2) % number3);
        System.out.println(((number1 % number3) * (number2 % number3)) % number3);
    }
}
