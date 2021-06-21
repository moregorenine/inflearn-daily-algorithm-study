package step2_if.q2_9498_test_score;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int number = Integer.parseInt(st.nextToken());

        printScoreToGrades(number);

    }

    private static void printScoreToGrades(int number) {
        String grades = "";
        if (number >= 90) {
            grades = "A";
        } else if (number >= 80) {
            grades = "B";
        } else if (number >= 70) {
            grades = "C";
        } else if (number >= 60) {
            grades = "D";
        } else {
            grades = "F";
        }
        System.out.println(grades);
    }

}
