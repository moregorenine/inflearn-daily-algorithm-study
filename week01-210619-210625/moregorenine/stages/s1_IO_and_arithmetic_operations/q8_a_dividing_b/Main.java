package kr.boj.stages.s1_IO_and_arithmetic_operations.q8_a_dividing_b;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        double number1 = Double.parseDouble(st.nextToken());
        double number2 = Double.parseDouble(st.nextToken());

        System.out.println(number1 / number2);
    }
}
