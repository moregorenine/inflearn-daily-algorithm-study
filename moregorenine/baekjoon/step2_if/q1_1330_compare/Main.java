package baekjoon.step2_if.q1_1330_compare;

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

        if (number1 > number2) {
            System.out.println(">");
        } else if (number1 < number2) {
            System.out.println("<");
        } else {
            System.out.println("==");
        }

    }
}
