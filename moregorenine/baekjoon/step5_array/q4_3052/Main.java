package baekjoon.step5_array.q4_3052;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int loop = 10;
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < loop; i++) {
            hs.add(Integer.parseInt(br.readLine()) % 42);
        }
        System.out.printf("%d\n", hs.size());
    }

}
