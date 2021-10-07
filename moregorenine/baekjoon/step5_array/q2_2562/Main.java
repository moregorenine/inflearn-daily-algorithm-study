package baekjoon.step5_array.q2_2562;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            final int INPUT_LOOP_COUNT = 9;
            int inputNumber, maxNumber = 0, maxNumberIndex = 0;

            for (int index = 1; index <= INPUT_LOOP_COUNT; index++) {
                inputNumber = Integer.parseInt(br.readLine());
                if (inputNumber > maxNumber) {
                    maxNumber = inputNumber;
                    maxNumberIndex = index;
                }
            }

            System.out.printf("%d\n%d", maxNumber, maxNumberIndex);
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        } finally {
            br.close();
        }

    }

}
