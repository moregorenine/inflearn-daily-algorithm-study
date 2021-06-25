package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 상금_헌터_15953 {
    static int[] Rank_2017 = {1, 2, 3, 4, 5, 6};
    static int[] Rank_2018 = {1, 2, 4, 8, 16};
    static int[] Money_2017 = {500, 300, 200, 50, 30, 10};
    static int[] Money_2018 = {512, 256, 128, 64, 32};

    public static void main(String[] args) throws IOException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int temp = 0;
            int money = 0;
            if (a != 0) {

                for (int i = 0; i < Rank_2017.length; i++) {
                    temp += Rank_2017[i];
                    if (temp >= a) {
                        money += Money_2017[i];
                        break;
                    }
                }
            }
            if (b != 0) {
                temp = 0;
                for (int j = 0; j < Rank_2018.length; j++) {
                    temp += Rank_2018[j];
                    if (temp >= b) {
                        money += Money_2018[j];
                        break;
                    }
                }
            }
            System.out.println(money * 10000);

        }

    }

}
