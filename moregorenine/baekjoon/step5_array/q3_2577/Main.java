package baekjoon.step5_array.q3_2577;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int number1 = Integer.parseInt(br.readLine());
            int number2 = Integer.parseInt(br.readLine());
            int number3 = Integer.parseInt(br.readLine());

            int intMultiple = number1 * number2 * number3;
            HashMap<Integer, Integer> hm = new HashMap<>();

            int lastDigit;

            do {
                lastDigit = intMultiple % 10;
                intMultiple = intMultiple / 10;
                hm.put(lastDigit, hm.getOrDefault(lastDigit, 0) + 1);
            } while (intMultiple > 0);

            for (int i = 0; i < 10; i++) {
                if (hm.get(i) != null) {
                    System.out.printf("%d\n", hm.get(i));
                } else {
                    System.out.printf("%d\n", 0);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        } finally {
            br.close();
        }

    }

}
