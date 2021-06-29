package baekjoon.step3_for.q2_10950;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            int count = Integer.parseInt(br.readLine());
            String[] twoNumbers = setTwoNumbersUntilCount(br, count);
            showTwoNumbers(twoNumbers);
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        } finally {
            br.close();
        }

    }

    private static String[] setTwoNumbersUntilCount(BufferedReader br, int count) throws IOException {
        String[] twoNumbers = new String[count];
        try {
            for (int i = 0; i < count; i++) {
                String str = br.readLine();
                twoNumbers[i] = str;
            }
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
        return twoNumbers;
    }

    private static void showTwoNumbers(String[] twoNumbers) {
        for (String item : twoNumbers) {
            String[] twoNumber = item.split(" ");
            System.out.printf("%d\n", Integer.parseInt(twoNumber[0]) + Integer.parseInt(twoNumber[1]));
        }
    }

}
