package baekjoon.step2_if.q5_2884_alarm_clock;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int hour = Integer.parseInt(st.nextToken());
//        st = new StringTokenizer(br.readLine());
        int minute = Integer.parseInt(st.nextToken());

        setAlramTime(hour, minute, 45);
    }

    private static void setAlramTime(int inHour, int inMinute, int beforMinute) {
        int outHour = inHour;
        int outMinute = inMinute - beforMinute;

        if (outMinute < 0) {
            outHour = (outHour - 1 < 0) ? --outHour + 24 : --outHour;
            outMinute += 60;
        }

        System.out.printf("%d %d\n", outHour, outMinute);

    }

}
